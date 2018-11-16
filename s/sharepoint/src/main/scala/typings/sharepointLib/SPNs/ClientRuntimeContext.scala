package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRuntimeContext")
@js.native
class ClientRuntimeContext protected ()
  extends microsoftDashAjaxLib.SysNs.IDisposable {
  def this(serverRelativeUrlOrFullUrl: java.lang.String) = this()
  def addQuery(query: ClientAction): scala.Unit = js.native
  def addQueryIdAndResultObject(id: scala.Double, obj: js.Any): scala.Unit = js.native
  def add_beginningRequest(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestEventArgs, scala.Unit]): scala.Unit = js.native
  def add_executingWebRequest(value: js.Function2[/* sender */ js.Any, /* args */ WebRequestEventArgs, scala.Unit]): scala.Unit = js.native
  def add_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, scala.Unit]): scala.Unit = js.native
  def add_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, scala.Unit]): scala.Unit = js.native
  def castTo(obj: ClientObject, `type`: js.Any): ClientObject = js.native
  //#region Methods
  /**
          * Releases resources held by an object that implements the Sys.IDisposable interface.
          * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
          */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def executeQueryAsync(): scala.Unit = js.native
  def executeQueryAsync(
    succeededCallback: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, scala.Unit]
  ): scala.Unit = js.native
  def executeQueryAsync(
    succeededCallback: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, scala.Unit],
    failedCallback: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, scala.Unit]
  ): scala.Unit = js.native
  def get_applicationName(): java.lang.String = js.native
  def get_clientTag(): java.lang.String = js.native
  def get_formDigestHandlingEnabled(): scala.Boolean = js.native
  def get_hasPendingRequest(): scala.Boolean = js.native
  def get_pendingRequest(): ClientRequest = js.native
  def get_requestTimeout(): scala.Double = js.native
  def get_serverLibraryVersion(): java.lang.String = js.native
  def get_serverSchemaVersion(): java.lang.String = js.native
  def get_staticObjects(): js.Any = js.native
  def get_traceCorrelationId(): java.lang.String = js.native
  def get_url(): java.lang.String = js.native
  def get_viaUrl(): java.lang.String = js.native
  def get_webRequestExecutorFactory(): IWebRequestExecutorFactory = js.native
  def load(clientObject: ClientObject, exps: java.lang.String*): scala.Unit = js.native
  def loadQuery[T](clientObjectCollection: ClientObjectCollection[T]): js.Any = js.native
  def loadQuery[T](clientObjectCollection: ClientObjectCollection[T], exp: java.lang.String): js.Any = js.native
  def parseObjectFromJsonString(json: java.lang.String): js.Any = js.native
  def parseObjectFromJsonString(json: java.lang.String, skipTypeFixup: scala.Boolean): js.Any = js.native
  def remove_beginningRequest(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestEventArgs, scala.Unit]): scala.Unit = js.native
  def remove_executingWebRequest(value: js.Function2[/* sender */ js.Any, /* args */ WebRequestEventArgs, scala.Unit]): scala.Unit = js.native
  def remove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, scala.Unit]): scala.Unit = js.native
  def remove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, scala.Unit]): scala.Unit = js.native
  def set_applicationName(value: java.lang.String): scala.Unit = js.native
  def set_clientTag(value: java.lang.String): scala.Unit = js.native
  def set_formDigestHandlingEnabled(value: scala.Boolean): scala.Unit = js.native
  def set_requestTimeout(value: scala.Double): scala.Unit = js.native
  def set_traceCorrelationId(value: java.lang.String): scala.Unit = js.native
  def set_viaUrl(value: java.lang.String): scala.Unit = js.native
  def set_webRequestExecutorFactory(value: IWebRequestExecutorFactory): scala.Unit = js.native
}

