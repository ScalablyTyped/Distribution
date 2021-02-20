package typings.reactNativeOrientation

import typings.reactNativeOrientation.mod.orientation
import typings.reactNativeOrientation.mod.specificOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeOrientationStrings {
  
  @js.native
  sealed trait LANDSCAPE extends orientation
  @scala.inline
  def LANDSCAPE: LANDSCAPE = "LANDSCAPE".asInstanceOf[LANDSCAPE]
  
  @js.native
  sealed trait `LANDSCAPE-LEFT` extends specificOrientation
  @scala.inline
  def `LANDSCAPE-LEFT`: `LANDSCAPE-LEFT` = "LANDSCAPE-LEFT".asInstanceOf[`LANDSCAPE-LEFT`]
  
  @js.native
  sealed trait `LANDSCAPE-RIGHT` extends specificOrientation
  @scala.inline
  def `LANDSCAPE-RIGHT`: `LANDSCAPE-RIGHT` = "LANDSCAPE-RIGHT".asInstanceOf[`LANDSCAPE-RIGHT`]
  
  @js.native
  sealed trait PORTRAIT
    extends orientation
       with specificOrientation
  @scala.inline
  def PORTRAIT: PORTRAIT = "PORTRAIT".asInstanceOf[PORTRAIT]
  
  @js.native
  sealed trait PORTRAITUPSIDEDOWN
    extends orientation
       with specificOrientation
  @scala.inline
  def PORTRAITUPSIDEDOWN: PORTRAITUPSIDEDOWN = "PORTRAITUPSIDEDOWN".asInstanceOf[PORTRAITUPSIDEDOWN]
  
  @js.native
  sealed trait UNKNOWN
    extends orientation
       with specificOrientation
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
}
