package typings.reactStonecutter

import typings.reactStonecutter.mod.LengthUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactStonecutterStrings {
  
  @js.native
  sealed trait deg extends StObject
  inline def deg: deg = "deg".asInstanceOf[deg]
  
  @js.native
  sealed trait em
    extends StObject
       with LengthUnit
  inline def em: em = "em".asInstanceOf[em]
  
  @js.native
  sealed trait px
    extends StObject
       with LengthUnit
  inline def px: px = "px".asInstanceOf[px]
  
  @js.native
  sealed trait rem
    extends StObject
       with LengthUnit
  inline def rem: rem = "rem".asInstanceOf[rem]
}
