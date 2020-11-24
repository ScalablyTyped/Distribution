package typings.qrImage

import typings.qrImage.mod.ecLevel
import typings.qrImage.mod.imageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qrImageStrings {
  
  @scala.inline
  def H: H = "H".asInstanceOf[H]
  
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  
  @scala.inline
  def M: M = "M".asInstanceOf[M]
  
  @scala.inline
  def Q: Q = "Q".asInstanceOf[Q]
  
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  
  @scala.inline
  def pdf: pdf = "pdf".asInstanceOf[pdf]
  
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @scala.inline
  def svg: svg = "svg".asInstanceOf[svg]
  
  @js.native
  sealed trait H extends ecLevel
  
  @js.native
  sealed trait L extends ecLevel
  
  @js.native
  sealed trait M extends ecLevel
  
  @js.native
  sealed trait Q extends ecLevel
  
  @js.native
  sealed trait eps extends imageType
  
  @js.native
  sealed trait pdf extends imageType
  
  @js.native
  sealed trait png extends imageType
  
  @js.native
  sealed trait svg extends imageType
}
