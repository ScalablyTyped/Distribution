package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCServerOptions
  extends /* additionalOptions */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  // In milliseconds, the timeout for calling res(err, data) when
  // your emit() call expects an ACK response from the other side
  // (when callback is provided to emit)
  var ackTimeout: js.UndefOr[scala.Double] = js.undefined
  // Whether or not clients are allowed to publish messages to channels
  var allowClientPublish: js.UndefOr[scala.Boolean] = js.undefined
  // A unique name for your app (this is used internally for
  // various things such as the directory name in which to store socket
  // file descriptors) - If you don't provide an appName, SC will
  // generate a random one (UUID v4)
  var appName: js.UndefOr[java.lang.String] = js.undefined
  // The algorithm to use to sign and verify JWT tokens.
  var authAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  // The default expiry for auth tokens in seconds
  var authDefaultExpiry: js.UndefOr[scala.Double] = js.undefined
  // The key which SC will use to encrypt/decrypt authTokens, defaults
  // to a 256 bits cryptographically random hex string
  // The default JWT algorithm used is 'HS256'.
  // If you want to use RSA or ECDSA, you should provide a authPrivateKey
  // and authPublicKey instead of authKey.
  var authKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.undefined
  // If using an RSA or ECDSA algorithm to sign the authToken, you will need
  // to provide an authPrivateKey and authPublicKey in PEM format (string or Buffer).
  var authPrivateKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.undefined
  var authPublicKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.undefined
  var authSignAsync: js.UndefOr[scala.Boolean] = js.undefined
  var authVerifyAsync: js.UndefOr[scala.Boolean] = js.undefined
  // The path to a file used to bootstrap broker processes
  var brokerController: js.UndefOr[java.lang.String] = js.undefined
  // The default clustering/brokering engine (Node.js module name) which provides the
  // SCWorker.exchange object and manages brokers behind the scenes.
  // You shouldn't need to change this unless you want to build your own
  // process clustering engine (which is difficult to do).
  var brokerEngine: js.UndefOr[java.lang.String] = js.undefined
  // Number of broker processes
  var brokers: js.UndefOr[scala.Double] = js.undefined
  // In milliseconds, how long a client has to connect to SC before timing out
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  // Crash workers when an error happens - This is the most sensible default
  var crashWorkerOnError: js.UndefOr[scala.Boolean] = js.undefined
  // If you run your master process (server.js) as super user, this option
  // lets you downgrade worker and broker processes to run under
  // the specified user (with fewer permissions than master) - You can provide
  // a Linux UID or username
  var downgradeToUser: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  // Should be either 'dev' or 'prod' - This affects the shutdown procedure
  // when a 'SIGUSR2' signal is received by master. In 'dev', a SIGUSR2 will
  // trigger an immediate shutdown of workers. In 'prod' workers will
  // be terminated progressively in accordance with processTermTimeout.
  var environment: js.UndefOr[java.lang.String] = js.undefined
  // In milliseconds - If the socket handshake hasn't been completed before
  // this timeout is reached, the new connection attempt will be terminated.
  var handshakeTimeout: js.UndefOr[scala.Double] = js.undefined
  // Lets you specify a host name to bind to - Defaults to
  // 127.0.0.1 (localhost)
  var host: js.UndefOr[java.lang.String] = js.undefined
  var httpServer: js.UndefOr[nodeLib.httpMod.Server] = js.undefined
  // An ID to associate with this specific instance of SC
  // this may be useful if you are running an SC app on multiple
  // hosts - You can access the instanceId from the Broker object
  // (inside brokerController) - If you don't provide an instanceId,
  // SC will generate a random one (UUID v4)
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  // In milliseconds, the timeout for calling res(err, data) when
  // your sendToWorker, sendToBroker or sendToMaster (IPC) call
  // expects an ACK response from the other process
  // (when callback is provided)
  var ipcAckTimeout: js.UndefOr[scala.Double] = js.undefined
  // Setting this to true will cause the master process to shut down when
  // it receives a SIGUSR2 signal (instead of just the workers).
  // If you're using nodemon, set this to true.
  var killMasterOnSignal: js.UndefOr[scala.Boolean] = js.undefined
  // Kill/respawn a worker process if its memory consumption exceeds this
  // threshold (in bytes) - If this is null (default), this behavior
  // will be switched off
  var killWorkerMemoryThreshold: js.UndefOr[scala.Double] = js.undefined
  // A log level of 3 will log everything, 2 will show notices and errors,
  // 1 will only log errors, 0 will log nothing
  var logLevel: js.UndefOr[
    socketclusterDashServerLib.socketclusterDashServerLibNumbers.`0` | socketclusterDashServerLib.socketclusterDashServerLibNumbers.`1` | socketclusterDashServerLib.socketclusterDashServerLibNumbers.`2` | socketclusterDashServerLib.socketclusterDashServerLibNumbers.`3`
  ] = js.undefined
  var maxPayload: js.UndefOr[scala.Double] = js.undefined
  // Whether or not a 'warning' event should be emitted (and logged to console)
  // whenever an action is blocked by a middleware function
  var middlewareEmitWarnings: js.UndefOr[scala.Double] = js.undefined
  // Origins which are allowed to connect to the real-time scServer
  var origins: js.UndefOr[java.lang.String] = js.undefined
  // The URL path reserved by SocketCluster clients to interact with the server
  var path: js.UndefOr[java.lang.String] = js.undefined
  // perMessageDeflate compression. Note that this option is passed directly to the wsEngine's
  // Server object. So if you're using 'ws' as the engine, you can pass an object instead of
  // a boolean. Search for perMessageDeflate here:
  // https://github.com/websockets/ws/blob/master/doc/ws.md#new-websocketserveroptions-callback
  // Note that by default, per-message deflate only kicks in for messages > 1024 bytes.
  var perMessageDeflate: js.UndefOr[scala.Boolean] = js.undefined
  // The interval in milliseconds on which to
  // send a ping to the client to check that
  // it is still alive
  var pingInterval: js.UndefOr[scala.Double] = js.undefined
  // How many milliseconds to wait without receiving a ping
  // before closing the socket
  var pingTimeout: js.UndefOr[scala.Double] = js.undefined
  var pingTimeoutDisabled: js.UndefOr[scala.Boolean] = js.undefined
  // The port on which to listen for outside connections/requests
  var port: js.UndefOr[scala.Double] = js.undefined
  // Maximum amount of milliseconds to wait before force-killing
  // a process after it was passed a 'SIGTERM' or 'SIGUSR2' signal
  var processTermTimeout: js.UndefOr[scala.Double] = js.undefined
  // Whether or not errors from child processes (workers and brokers)
  // should be passed to the current master process
  var propagateErrors: js.UndefOr[scala.Boolean] = js.undefined
  // Whether or not warnings from child processes (workers and brokers)
  // should be passed to the current master process
  var propagateWarnings: js.UndefOr[scala.Double] = js.undefined
  // Can be 'http' or 'https'
  var protocol: js.UndefOr[
    socketclusterDashServerLib.socketclusterDashServerLibStrings.http | socketclusterDashServerLib.socketclusterDashServerLibStrings.https
  ] = js.undefined
  // This is the same as the object provided to Node.js's https server
  var protocolOptions: js.UndefOr[nodeLib.httpsMod.ServerOptions] = js.undefined
  // This allows you to batch multiple messages together when passing them across
  // message brokers. This may improve the efficiency of your pub/sub operations.
  // This value is in milliseconds. 5 is generally a safe value to set this to.
  var pubSubBatchDuration: js.UndefOr[scala.Double] = js.undefined
  // By default, SC will reboot all workers when it receives a 'SIGUSR2' signal -
  // This can be used for updating workers with fresh source code in production
  var rebootOnSignal: js.UndefOr[scala.Boolean] = js.undefined
  // Reboot workers when they crash - This is a necessity
  // in production but can be turned off for debugging
  var rebootWorkerOnCrash: js.UndefOr[scala.Boolean] = js.undefined
  // Defaults to "rr", but can be set to "none"
  var schedulingPolicy: js.UndefOr[
    socketclusterDashServerLib.socketclusterDashServerLibStrings.rr | socketclusterDashServerLib.socketclusterDashServerLibStrings.none
  ] = js.undefined
  // A key which various SC processes will use to interact with
  // scBroker broker processes securely, defaults to a 256 bits
  // cryptographically random hex string
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
  // The maximum number of unique channels which a single
  // socket can subscribe to
  var socketChannelLimit: js.UndefOr[scala.Double] = js.undefined
  // The root directory in which to store your socket files in Linux.
  var socketRoot: js.UndefOr[java.lang.String] = js.undefined
  // In milliseconds - If the socket cannot upgrade transport
  // within this period, it will stop trying
  var socketUpgradeTimeout: js.UndefOr[scala.Double] = js.undefined
  // This option is passed to the Node.js HTTP server if provided
  var tcpSynBacklog: js.UndefOr[scala.Double] = js.undefined
  // The path to a file used to bootstrap the workerCluster process
  var workerClusterController: js.UndefOr[java.lang.String] = js.undefined
  // The path to a file used to bootstrap worker processes
  var workerController: js.UndefOr[java.lang.String] = js.undefined
  // SC keeps track of request per minutes internally - This allows you to change
  // how often this gets updated
  var workerStatusInterval: js.UndefOr[scala.Double] = js.undefined
  // Number of worker processes
  var workers: js.UndefOr[scala.Double] = js.undefined
  // This can be the name of an npm module or a path to a Node.js module
  // to use as the WebSocket server engine.
  // You can now set this to 'sc-uws' for a massive speedup of at least 2x!
  var wsEngine: js.UndefOr[js.Any] = js.undefined
  var wsEngineServerOptions: js.UndefOr[wsLib.wsMod.ClientOptions] = js.undefined
}

object SCServerOptions {
  @scala.inline
  def apply(
    StringDictionary: /* additionalOptions */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ackTimeout: scala.Int | scala.Double = null,
    allowClientPublish: js.UndefOr[scala.Boolean] = js.undefined,
    appName: java.lang.String = null,
    authAlgorithm: java.lang.String = null,
    authDefaultExpiry: scala.Int | scala.Double = null,
    authKey: jsonwebtokenLib.jsonwebtokenMod.Secret = null,
    authPrivateKey: jsonwebtokenLib.jsonwebtokenMod.Secret = null,
    authPublicKey: jsonwebtokenLib.jsonwebtokenMod.Secret = null,
    authSignAsync: js.UndefOr[scala.Boolean] = js.undefined,
    authVerifyAsync: js.UndefOr[scala.Boolean] = js.undefined,
    brokerController: java.lang.String = null,
    brokerEngine: java.lang.String = null,
    brokers: scala.Int | scala.Double = null,
    connectTimeout: scala.Int | scala.Double = null,
    crashWorkerOnError: js.UndefOr[scala.Boolean] = js.undefined,
    downgradeToUser: scala.Double | java.lang.String = null,
    environment: java.lang.String = null,
    handshakeTimeout: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    httpServer: nodeLib.httpMod.Server = null,
    instanceId: java.lang.String = null,
    ipcAckTimeout: scala.Int | scala.Double = null,
    killMasterOnSignal: js.UndefOr[scala.Boolean] = js.undefined,
    killWorkerMemoryThreshold: scala.Int | scala.Double = null,
    logLevel: socketclusterDashServerLib.socketclusterDashServerLibNumbers.`0` | socketclusterDashServerLib.socketclusterDashServerLibNumbers.`1` | socketclusterDashServerLib.socketclusterDashServerLibNumbers.`2` | socketclusterDashServerLib.socketclusterDashServerLibNumbers.`3` = null,
    maxPayload: scala.Int | scala.Double = null,
    middlewareEmitWarnings: scala.Int | scala.Double = null,
    origins: java.lang.String = null,
    path: java.lang.String = null,
    perMessageDeflate: js.UndefOr[scala.Boolean] = js.undefined,
    pingInterval: scala.Int | scala.Double = null,
    pingTimeout: scala.Int | scala.Double = null,
    pingTimeoutDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    processTermTimeout: scala.Int | scala.Double = null,
    propagateErrors: js.UndefOr[scala.Boolean] = js.undefined,
    propagateWarnings: scala.Int | scala.Double = null,
    protocol: socketclusterDashServerLib.socketclusterDashServerLibStrings.http | socketclusterDashServerLib.socketclusterDashServerLibStrings.https = null,
    protocolOptions: nodeLib.httpsMod.ServerOptions = null,
    pubSubBatchDuration: scala.Int | scala.Double = null,
    rebootOnSignal: js.UndefOr[scala.Boolean] = js.undefined,
    rebootWorkerOnCrash: js.UndefOr[scala.Boolean] = js.undefined,
    schedulingPolicy: socketclusterDashServerLib.socketclusterDashServerLibStrings.rr | socketclusterDashServerLib.socketclusterDashServerLibStrings.none = null,
    secretKey: java.lang.String = null,
    socketChannelLimit: scala.Int | scala.Double = null,
    socketRoot: java.lang.String = null,
    socketUpgradeTimeout: scala.Int | scala.Double = null,
    tcpSynBacklog: scala.Int | scala.Double = null,
    workerClusterController: java.lang.String = null,
    workerController: java.lang.String = null,
    workerStatusInterval: scala.Int | scala.Double = null,
    workers: scala.Int | scala.Double = null,
    wsEngine: js.Any = null,
    wsEngineServerOptions: wsLib.wsMod.ClientOptions = null
  ): SCServerOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ackTimeout != null) __obj.updateDynamic("ackTimeout")(ackTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClientPublish)) __obj.updateDynamic("allowClientPublish")(allowClientPublish)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (authAlgorithm != null) __obj.updateDynamic("authAlgorithm")(authAlgorithm)
    if (authDefaultExpiry != null) __obj.updateDynamic("authDefaultExpiry")(authDefaultExpiry.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (authPrivateKey != null) __obj.updateDynamic("authPrivateKey")(authPrivateKey.asInstanceOf[js.Any])
    if (authPublicKey != null) __obj.updateDynamic("authPublicKey")(authPublicKey.asInstanceOf[js.Any])
    if (!js.isUndefined(authSignAsync)) __obj.updateDynamic("authSignAsync")(authSignAsync)
    if (!js.isUndefined(authVerifyAsync)) __obj.updateDynamic("authVerifyAsync")(authVerifyAsync)
    if (brokerController != null) __obj.updateDynamic("brokerController")(brokerController)
    if (brokerEngine != null) __obj.updateDynamic("brokerEngine")(brokerEngine)
    if (brokers != null) __obj.updateDynamic("brokers")(brokers.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(crashWorkerOnError)) __obj.updateDynamic("crashWorkerOnError")(crashWorkerOnError)
    if (downgradeToUser != null) __obj.updateDynamic("downgradeToUser")(downgradeToUser.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (httpServer != null) __obj.updateDynamic("httpServer")(httpServer)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (ipcAckTimeout != null) __obj.updateDynamic("ipcAckTimeout")(ipcAckTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(killMasterOnSignal)) __obj.updateDynamic("killMasterOnSignal")(killMasterOnSignal)
    if (killWorkerMemoryThreshold != null) __obj.updateDynamic("killWorkerMemoryThreshold")(killWorkerMemoryThreshold.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (maxPayload != null) __obj.updateDynamic("maxPayload")(maxPayload.asInstanceOf[js.Any])
    if (middlewareEmitWarnings != null) __obj.updateDynamic("middlewareEmitWarnings")(middlewareEmitWarnings.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(perMessageDeflate)) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate)
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(pingTimeoutDisabled)) __obj.updateDynamic("pingTimeoutDisabled")(pingTimeoutDisabled)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (processTermTimeout != null) __obj.updateDynamic("processTermTimeout")(processTermTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateErrors)) __obj.updateDynamic("propagateErrors")(propagateErrors)
    if (propagateWarnings != null) __obj.updateDynamic("propagateWarnings")(propagateWarnings.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocolOptions != null) __obj.updateDynamic("protocolOptions")(protocolOptions)
    if (pubSubBatchDuration != null) __obj.updateDynamic("pubSubBatchDuration")(pubSubBatchDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(rebootOnSignal)) __obj.updateDynamic("rebootOnSignal")(rebootOnSignal)
    if (!js.isUndefined(rebootWorkerOnCrash)) __obj.updateDynamic("rebootWorkerOnCrash")(rebootWorkerOnCrash)
    if (schedulingPolicy != null) __obj.updateDynamic("schedulingPolicy")(schedulingPolicy.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    if (socketChannelLimit != null) __obj.updateDynamic("socketChannelLimit")(socketChannelLimit.asInstanceOf[js.Any])
    if (socketRoot != null) __obj.updateDynamic("socketRoot")(socketRoot)
    if (socketUpgradeTimeout != null) __obj.updateDynamic("socketUpgradeTimeout")(socketUpgradeTimeout.asInstanceOf[js.Any])
    if (tcpSynBacklog != null) __obj.updateDynamic("tcpSynBacklog")(tcpSynBacklog.asInstanceOf[js.Any])
    if (workerClusterController != null) __obj.updateDynamic("workerClusterController")(workerClusterController)
    if (workerController != null) __obj.updateDynamic("workerController")(workerController)
    if (workerStatusInterval != null) __obj.updateDynamic("workerStatusInterval")(workerStatusInterval.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    if (wsEngine != null) __obj.updateDynamic("wsEngine")(wsEngine)
    if (wsEngineServerOptions != null) __obj.updateDynamic("wsEngineServerOptions")(wsEngineServerOptions)
    __obj.asInstanceOf[SCServerOptions]
  }
}

