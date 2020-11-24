package typings.reactStonecutter

import typings.reactStonecutter.mod.LengthUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactStonecutterStrings {
  
  @scala.inline
  def deg: deg = "deg".asInstanceOf[deg]
  
  @scala.inline
  def em: em = "em".asInstanceOf[em]
  
  @scala.inline
  def px: px = "px".asInstanceOf[px]
  
  @scala.inline
  def rem: rem = "rem".asInstanceOf[rem]
  
  @js.native
  sealed trait deg extends js.Object
  
  @js.native
  sealed trait em extends LengthUnit
  
  @js.native
  sealed trait px extends LengthUnit
  
  @js.native
  sealed trait rem extends LengthUnit
}
