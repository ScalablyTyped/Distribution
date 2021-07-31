package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ProxyWebRequestExecutor")
@js.native
class ProxyWebRequestExecutor protected ()
  extends StObject
     with WebRequestExecutor {
  def this(url: String) = this()
  def this(url: String, options: js.Any) = this()
  
  //#endregion
  //#region Methods
  /**
    * Stops the pending network request issued by the executor.
    * The specifics of aborting a request vary depending on how an executor is implemented.
    * However, all executors that derive from WebRequestExecutor must set their state to aborted and must raise the completed event of the associated Sys.Net.WebRequest object.
    * The executor properties do not contain consistent data after abort has been called.
    */
  /* CompleteClass */
  override def abort(): Unit = js.native
  
  /**
    * Instructs the executor to execute a Web request.
    * When this method is called, the executor packages the content of the Web request instance and initiates processing.
    * This method is intended to be used by a custom executor. If you are implementing a custom executor, you instantiate the executor, assign it to the Web request instance, and then invoke the method on the executor instance.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb383834(v=vs.100).aspx}
    */
  /* CompleteClass */
  override def executeRequest(): Unit = js.native
  
  /**
    * Gets all the response headers for the current request.
    * If a request finished successfully and with valid response data, this method returns all the response headers.
    * @return All the response headers
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310805(v=vs.100).aspx}
    */
  /* CompleteClass */
  override def getAllResponseHeaders(): String = js.native
  
  /**
    * Gets the value of the specified response header.
    * @return The specified response header.
    */
  /* CompleteClass */
  override def getResponseHeader(key: String): String = js.native
  
  /**
    * Gets a value indicating whether the request associated with the executor was aborted.
    * When the current instance of the Sys.Net.WebRequestExecutor class is aborted, it must set its state to aborted and it must raise the completed event of the associated request object.
    * @return true if the request associated with the executor was aborted; otherwise, false.
    */
  /* CompleteClass */
  override def get_aborted(): Boolean = js.native
  
  /**
    * Gets a value indicating whether the request completed successfully.
    * Successful completion usually means a well-formed response was received by the executor.
    * If a response was received, the current instance of the Sys.Net.WebRequestExecutor class must set its state to completed.
    * It must also raise the completed event of the associated request object.
    * @return true if the request completed successfully; otherwise, false.
    */
  /* CompleteClass */
  override def get_responseAvailable(): Boolean = js.native
  
  /**
    * Gets the text representation of the response body. When a request has completed successfully with valid response data, this property returns the text that is contained in the response body.
    * @return The text representation of the response body.
    */
  /* CompleteClass */
  override def get_responseData(): String = js.native
  
  /**
    * Returns a value indicating whether the executor has started processing the request.
    * The executor returns true if substantial processing of the request has started. For executors that make network calls, substantial processing means that a network call has been started.
    * @return true if the executor has started processing the request; otherwise, false.
    */
  /* CompleteClass */
  override def get_started(): Boolean = js.native
  
  /**
    * Gets a success status code.
    * The statusCode property returns an integer that specifies that a request completed successfully and with valid response data.
    * @return An integer that represents a status code.
    */
  /* CompleteClass */
  override def get_statusCode(): Double = js.native
  
  /**
    * Gets status information about a request that completed successfully.
    * The statusText property returns status information if a request completed successfully and with valid response data.
    * @return the status text
    */
  /* CompleteClass */
  override def get_statusText(): String = js.native
  
  /**
    * Gets a value indicating whether the request timed out.
    * Executors use the time-out information associated with the request to raise the completed event on the associated WebRequest object.
    * @return true if the request timed out; otherwise, false.
    */
  /* CompleteClass */
  override def get_timedOut(): Boolean = js.native
  
  /**
    * Gets the WebRequest object associated with the executor.
    * @return The WebRequest object associated with the current executor instance.
    */
  /* CompleteClass */
  override def get_webRequest(): WebRequest = js.native
  
  /**
    * Attempts to get the response to the current request as an XMLDOM object.
    * If a request finished successfully with valid response data, this method tries to get the response as an XMLDOM object.
    */
  /* CompleteClass */
  override def get_xml(): XMLDocument = js.native
  
  //#endregion
  //#region Properties
  /**
    * Gets the JSON-evaluated object from the response.
    * @return The JSON-evaluated response object.
    */
  /* CompleteClass */
  override def `object`(): js.Any = js.native
}
