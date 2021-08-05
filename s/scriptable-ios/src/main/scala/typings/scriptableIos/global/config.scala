package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Configuration the script runs with._
  * @see https://docs.scriptable.app/config
  */
object config {
  
  @JSGlobal("config")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Whether the script was run from the home screen. You can add a script to the home screen from the script settings.
    * @see https://docs.scriptable.app/config/#runsfromhomescreen
    */
  @JSGlobal("config.runsFromHomeScreen")
  @js.native
  def runsFromHomeScreen: Boolean = js.native
  inline def runsFromHomeScreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsFromHomeScreen")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in the action extension.
    * @see https://docs.scriptable.app/config/#runsinactionextension
    */
  @JSGlobal("config.runsInActionExtension")
  @js.native
  def runsInActionExtension: Boolean = js.native
  inline def runsInActionExtension_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInActionExtension")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in the app.
    * @see https://docs.scriptable.app/config/#runsinapp
    */
  @JSGlobal("config.runsInApp")
  @js.native
  def runsInApp: Boolean = js.native
  inline def runsInApp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInApp")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in a notification.
    * @see https://docs.scriptable.app/config/#runsinnotification
    */
  @JSGlobal("config.runsInNotification")
  @js.native
  def runsInNotification: Boolean = js.native
  inline def runsInNotification_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInNotification")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in a widget.
    * @see https://docs.scriptable.app/config/#runsinwidget
    */
  @JSGlobal("config.runsInWidget")
  @js.native
  def runsInWidget: Boolean = js.native
  inline def runsInWidget_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInWidget")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running with Siri.
    * @see https://docs.scriptable.app/config/#runswithsiri
    */
  @JSGlobal("config.runsWithSiri")
  @js.native
  def runsWithSiri: Boolean = js.native
  inline def runsWithSiri_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsWithSiri")(x.asInstanceOf[js.Any])
  
  /**
    * The size of the widget the script is running in.
    *
    * Possible values are: `small`, `medium`, `large` and `null`. The value is `null` when the script is not running in a widget.
    * @see https://docs.scriptable.app/config/#widgetfamily
    */
  @JSGlobal("config.widgetFamily")
  @js.native
  def widgetFamily: String = js.native
  inline def widgetFamily_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("widgetFamily")(x.asInstanceOf[js.Any])
}
