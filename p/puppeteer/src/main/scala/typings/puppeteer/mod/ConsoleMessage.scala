package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "ConsoleMessage")
@js.native
open class ConsoleMessage protected () extends StObject {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[JSHandle[Any]],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
  
  /**
    * @returns An array of arguments passed to the console.
    */
  def args(): js.Array[JSHandle[Any]] = js.native
  
  /**
    * @returns The location of the console message.
    */
  def location(): ConsoleMessageLocation = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * @returns The array of locations on the stack of the console message.
    */
  def stackTrace(): js.Array[ConsoleMessageLocation] = js.native
  
  /**
    * @returns The text of the console message.
    */
  def text(): String = js.native
  
  /**
    * @returns The type of the console message.
    */
  def `type`(): ConsoleMessageType = js.native
}
