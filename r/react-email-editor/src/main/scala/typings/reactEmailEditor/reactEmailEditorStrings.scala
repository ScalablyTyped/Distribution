package typings.reactEmailEditor

import typings.reactEmailEditor.mod.DisplayMode
import typings.reactEmailEditor.mod.DockPosition
import typings.reactEmailEditor.mod.ThemeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactEmailEditorStrings {
  
  @js.native
  sealed trait dark
    extends StObject
       with ThemeColor
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait email
    extends StObject
       with DisplayMode
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait image extends StObject
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait left
    extends StObject
       with DockPosition
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait light
    extends StObject
       with ThemeColor
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait right
    extends StObject
       with DockPosition
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait web
    extends StObject
       with DisplayMode
  inline def web: web = "web".asInstanceOf[web]
}
