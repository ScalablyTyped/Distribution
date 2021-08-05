package typings.reactBytesizeIcons

import typings.reactBytesizeIcons.mod.StrokeLinecap
import typings.reactBytesizeIcons.mod.StrokeLinejoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBytesizeIconsStrings {
  
  @js.native
  sealed trait bevel
    extends StObject
       with StrokeLinejoin
  inline def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait butt
    extends StObject
       with StrokeLinecap
  inline def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait inherit
    extends StObject
       with StrokeLinecap
       with StrokeLinejoin
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait miter
    extends StObject
       with StrokeLinejoin
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait round
    extends StObject
       with StrokeLinecap
       with StrokeLinejoin
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait square
    extends StObject
       with StrokeLinecap
  inline def square: square = "square".asInstanceOf[square]
}
