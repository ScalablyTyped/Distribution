package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOpts extends js.Object {
  /**
    * Configure the authentication provider.
    * Default: No Authentication
    */
  var authentication: js.UndefOr[AuthenticationTls | AuthenticationToken] = js.native
  /**
    * The number of concurrent lookup requests that can be sent on each broker connection.
    * Setting a maximum helps to keep from overloading brokers.
    * You should set values over the default only if the client needs to produce and/or subscribe to thousands of Pulsar topics.
    * Default: 50000
    */
  var concurrentLookupRequest: js.UndefOr[Double] = js.native
  /**
    * The number of threads to use for handling connections to Pulsar brokers.
    * Default: 1
    */
  var ioThreads: js.UndefOr[Double] = js.native
  /**
    * The number of threads used by message listeners (consumers and readers).
    * Default: 1
    */
  var messageListenerThreads: js.UndefOr[Double] = js.native
  /**
    * The timeout for Node.js client operations (creating producers, subscribing to and unsubscribing from topics).
    * Retries will occur until this threshold is reached, at which point the operation will fail.
    * Default: 30
    */
  var operationTimeoutSeconds: js.UndefOr[Double] = js.native
  /**
    * The connection URL for the Pulsar cluster.
    */
  var serviceUrl: String = js.native
  /**
    * Interval between each stat info. Stats is activated with positive statsInterval. The value should be set to >= 1 second.
    * Default: 600
    */
  var statsIntervalInSeconds: js.UndefOr[Double] = js.native
  /**
    * The boolean value of setup whether the Pulsar client accepts untrusted TLS certificate from broker.
    * Default: false
    */
  var tlsAllowInsecureConnection: js.UndefOr[Boolean] = js.native
  /**
    * The file path for the trusted TLS certificate.
    */
  var tlsTrustCertsFilePath: js.UndefOr[String] = js.native
  /**
    * The boolean value of setup whether to enable TLS hostname verification.
    * Default: false
    */
  var tlsValidateHostname: js.UndefOr[Boolean] = js.native
}

object ClientOpts {
  @scala.inline
  def apply(serviceUrl: String): ClientOpts = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOpts]
  }
  @scala.inline
  implicit class ClientOptsOps[Self <: ClientOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServiceUrl(value: String): Self = this.set("serviceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthentication(value: AuthenticationTls | AuthenticationToken): Self = this.set("authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    @scala.inline
    def setConcurrentLookupRequest(value: Double): Self = this.set("concurrentLookupRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrentLookupRequest: Self = this.set("concurrentLookupRequest", js.undefined)
    @scala.inline
    def setIoThreads(value: Double): Self = this.set("ioThreads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIoThreads: Self = this.set("ioThreads", js.undefined)
    @scala.inline
    def setMessageListenerThreads(value: Double): Self = this.set("messageListenerThreads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageListenerThreads: Self = this.set("messageListenerThreads", js.undefined)
    @scala.inline
    def setOperationTimeoutSeconds(value: Double): Self = this.set("operationTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationTimeoutSeconds: Self = this.set("operationTimeoutSeconds", js.undefined)
    @scala.inline
    def setStatsIntervalInSeconds(value: Double): Self = this.set("statsIntervalInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatsIntervalInSeconds: Self = this.set("statsIntervalInSeconds", js.undefined)
    @scala.inline
    def setTlsAllowInsecureConnection(value: Boolean): Self = this.set("tlsAllowInsecureConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsAllowInsecureConnection: Self = this.set("tlsAllowInsecureConnection", js.undefined)
    @scala.inline
    def setTlsTrustCertsFilePath(value: String): Self = this.set("tlsTrustCertsFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsTrustCertsFilePath: Self = this.set("tlsTrustCertsFilePath", js.undefined)
    @scala.inline
    def setTlsValidateHostname(value: Boolean): Self = this.set("tlsValidateHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsValidateHostname: Self = this.set("tlsValidateHostname", js.undefined)
  }
  
}

