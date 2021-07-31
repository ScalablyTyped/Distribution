package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Access information about the script._
  * @see https://docs.scriptable.app/script
  */
object Script {
  
  @JSGlobal("Script")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Informs the system about script completion._
    *
    * Call this function to inform the system that the script has completed running.
    *
    * When a script is run inside Siri and the Shortcuts app, Scriptable use heuristics to determine if the script has completed. If you find that a script takes too long to complete,
    * you can manually call the `complete` function to stop the execution. Note that this should be done as the very last action the script performs.
    *
    * When the script is run from a share sheet, the `complete` function will complete execution and dismiss the presented view.
    * @see https://docs.scriptable.app/script/#complete
    */
  @scala.inline
  def complete(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("complete")().asInstanceOf[Unit]
  
  /**
    * _Name of the script._
    * @see https://docs.scriptable.app/script/#name
    */
  @scala.inline
  def name(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("name")().asInstanceOf[String]
  
  /**
    * _Sets output when running the script as a shortcut action._
    *
    * Use this function to pass values to other actions in the Shortcuts app. The output can be a text, a number, a boolean, a dictionary or a file path pointing to a file stored in
    * iCloud.
    *
    * You can also use JavaScripts `return` keyword to output a value to a shortcut.
    * @param value - Value to provide as output.
    * @see https://docs.scriptable.app/script/#setshortcutoutput
    */
  @scala.inline
  def setShortcutOutput(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShortcutOutput")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Sets the widget to be displayed._
    * @param widget - Widget to display.
    * @see https://docs.scriptable.app/script/#setwidget
    */
  @scala.inline
  def setWidget(widget: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWidget")(widget.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
