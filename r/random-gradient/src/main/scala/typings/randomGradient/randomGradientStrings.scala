package typings.randomGradient

import typings.randomGradient.mod.GradientDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomGradientStrings {
  
  @js.native
  sealed trait diagonal
    extends StObject
       with GradientDirection
  inline def diagonal: diagonal = "diagonal".asInstanceOf[diagonal]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with GradientDirection
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait radial
    extends StObject
       with GradientDirection
  inline def radial: radial = "radial".asInstanceOf[radial]
  
  @js.native
  sealed trait vertical
    extends StObject
       with GradientDirection
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
