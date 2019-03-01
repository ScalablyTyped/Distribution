package typings
package searchDashParamsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object searchDashParamsLibStrings {
  @js.native
  sealed trait brackets
    extends searchDashParamsLib.typingsEncodeMod.arrayFormat
  
  @js.native
  sealed trait default
    extends searchDashParamsLib.typingsEncodeMod.nullFormat
  
  @js.native
  sealed trait `empty-true`
    extends searchDashParamsLib.typingsEncodeMod.booleanFormat
  
  @js.native
  sealed trait hidden
    extends searchDashParamsLib.typingsEncodeMod.nullFormat
  
  @js.native
  sealed trait index
    extends searchDashParamsLib.typingsEncodeMod.arrayFormat
  
  @js.native
  sealed trait none
    extends searchDashParamsLib.typingsEncodeMod.arrayFormat
       with searchDashParamsLib.typingsEncodeMod.booleanFormat
  
  @js.native
  sealed trait string
    extends searchDashParamsLib.typingsEncodeMod.booleanFormat
       with searchDashParamsLib.typingsEncodeMod.nullFormat
  
  @js.native
  sealed trait unicode
    extends searchDashParamsLib.typingsEncodeMod.booleanFormat
  
  @scala.inline
  def brackets: brackets = "brackets".asInstanceOf[brackets]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def `empty-true`: `empty-true` = "empty-true".asInstanceOf[`empty-true`]
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def unicode: unicode = "unicode".asInstanceOf[unicode]
}

