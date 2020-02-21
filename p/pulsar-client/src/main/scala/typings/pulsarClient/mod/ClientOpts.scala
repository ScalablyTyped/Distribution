package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOpts extends js.Object {
  /**
    * Configure the authentication provider.
    * Default: No Authentication
    */
  var authentication: js.UndefOr[AuthenticationTls] = js.undefined
  /**
    * The number of concurrent lookup requests that can be sent on each broker connection.
    * Setting a maximum helps to keep from overloading brokers.
    * You should set values over the default only if the client needs to produce and/or subscribe to thousands of Pulsar topics.
    * Default: 50000
    */
  var concurrentLookupRequest: js.UndefOr[Double] = js.undefined
  /**
    * The number of threads to use for handling connections to Pulsar brokers.
    * Default: 1
    */
  var ioThreads: js.UndefOr[Double] = js.undefined
  /**
    * The number of threads used by message listeners (consumers and readers).
    * Default: 1
    */
  var messageListenerThreads: js.UndefOr[Double] = js.undefined
  /**
    * The timeout for Node.js client operations (creating producers, subscribing to and unsubscribing from topics).
    * Retries will occur until this threshold is reached, at which point the operation will fail.
    * Default: 30
    */
  var operationTimeoutSeconds: js.UndefOr[Double] = js.undefined
  /**
    * The connection URL for the Pulsar cluster.
    */
  var serviceUrl: String
  /**
    * Interval between each stat info. Stats is activated with positive statsInterval. The value should be set to >= 1 second.
    * Default: 600
    */
  var statsIntervalInSeconds: js.UndefOr[Double] = js.undefined
  /**
    * The boolean value of setup whether the Pulsar client accepts untrusted TLS certificate from broker.
    * Default: false
    */
  var tlsAllowInsecureConnection: js.UndefOr[Boolean] = js.undefined
  /**
    * The file path for the trusted TLS certificate.
    */
  var tlsTrustCertsFilePath: js.UndefOr[String] = js.undefined
  /**
    * The boolean value of setup whether to enable TLS hostname verification.
    * Default: false
    */
  var tlsValidateHostname: js.UndefOr[Boolean] = js.undefined
}

object ClientOpts {
  @scala.inline
  def apply(
    serviceUrl: String,
    authentication: AuthenticationTls = null,
    concurrentLookupRequest: Int | Double = null,
    ioThreads: Int | Double = null,
    messageListenerThreads: Int | Double = null,
    operationTimeoutSeconds: Int | Double = null,
    statsIntervalInSeconds: Int | Double = null,
    tlsAllowInsecureConnection: js.UndefOr[Boolean] = js.undefined,
    tlsTrustCertsFilePath: String = null,
    tlsValidateHostname: js.UndefOr[Boolean] = js.undefined
  ): ClientOpts = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (concurrentLookupRequest != null) __obj.updateDynamic("concurrentLookupRequest")(concurrentLookupRequest.asInstanceOf[js.Any])
    if (ioThreads != null) __obj.updateDynamic("ioThreads")(ioThreads.asInstanceOf[js.Any])
    if (messageListenerThreads != null) __obj.updateDynamic("messageListenerThreads")(messageListenerThreads.asInstanceOf[js.Any])
    if (operationTimeoutSeconds != null) __obj.updateDynamic("operationTimeoutSeconds")(operationTimeoutSeconds.asInstanceOf[js.Any])
    if (statsIntervalInSeconds != null) __obj.updateDynamic("statsIntervalInSeconds")(statsIntervalInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsAllowInsecureConnection)) __obj.updateDynamic("tlsAllowInsecureConnection")(tlsAllowInsecureConnection.asInstanceOf[js.Any])
    if (tlsTrustCertsFilePath != null) __obj.updateDynamic("tlsTrustCertsFilePath")(tlsTrustCertsFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsValidateHostname)) __obj.updateDynamic("tlsValidateHostname")(tlsValidateHostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOpts]
  }
}

