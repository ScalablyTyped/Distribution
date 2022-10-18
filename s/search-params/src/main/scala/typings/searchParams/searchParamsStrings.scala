package typings.searchParams

import typings.searchParams.distEncodeMod.arrayFormat
import typings.searchParams.distEncodeMod.booleanFormat
import typings.searchParams.distEncodeMod.nullFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchParamsStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with nullFormat
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait brackets
    extends StObject
       with arrayFormat
  inline def brackets: brackets = "brackets".asInstanceOf[brackets]
  
  @js.native
  sealed trait `empty-true`
    extends StObject
       with booleanFormat
  inline def `empty-true`: `empty-true` = "empty-true".asInstanceOf[`empty-true`]
  
  @js.native
  sealed trait hidden
    extends StObject
       with nullFormat
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait index
    extends StObject
       with arrayFormat
  inline def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait none
    extends StObject
       with arrayFormat
       with booleanFormat
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait string
    extends StObject
       with booleanFormat
       with nullFormat
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait unicode
    extends StObject
       with booleanFormat
  inline def unicode: unicode = "unicode".asInstanceOf[unicode]
}
