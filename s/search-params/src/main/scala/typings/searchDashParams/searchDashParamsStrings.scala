package typings.searchDashParams

import typings.searchDashParams.typingsEncodeMod.arrayFormat
import typings.searchDashParams.typingsEncodeMod.booleanFormat
import typings.searchDashParams.typingsEncodeMod.nullFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object searchDashParamsStrings {
  @js.native
  sealed trait brackets extends arrayFormat
  
  @js.native
  sealed trait default extends nullFormat
  
  @js.native
  sealed trait `empty-true` extends booleanFormat
  
  @js.native
  sealed trait hidden extends nullFormat
  
  @js.native
  sealed trait index extends arrayFormat
  
  @js.native
  sealed trait none
    extends arrayFormat
       with booleanFormat
  
  @js.native
  sealed trait string
    extends booleanFormat
       with nullFormat
  
  @js.native
  sealed trait unicode extends booleanFormat
  
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

