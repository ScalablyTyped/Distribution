package typings.searchParams

import typings.searchParams.encodeMod.arrayFormat
import typings.searchParams.encodeMod.booleanFormat
import typings.searchParams.encodeMod.nullFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchParamsStrings {
  
  @js.native
  sealed trait default extends nullFormat
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait brackets extends arrayFormat
  @scala.inline
  def brackets: brackets = "brackets".asInstanceOf[brackets]
  
  @js.native
  sealed trait `empty-true` extends booleanFormat
  @scala.inline
  def `empty-true`: `empty-true` = "empty-true".asInstanceOf[`empty-true`]
  
  @js.native
  sealed trait hidden extends nullFormat
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait index extends arrayFormat
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait none
    extends arrayFormat
       with booleanFormat
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait string
    extends booleanFormat
       with nullFormat
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait unicode extends booleanFormat
  @scala.inline
  def unicode: unicode = "unicode".asInstanceOf[unicode]
}
