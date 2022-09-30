package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how colors are combined with the existing contents of a surface.
  */
@JSGlobal("BlendOp")
@js.native
open class BlendOp ()
  extends StObject
     with typings.sphereEngineBrowser.BlendOp {
  
  /* private */ /* CompleteClass */
  var _workaround: Null = js.native
}
object BlendOp {
  
  /**
    * Additive blend: The components of the source color are added to those of the destination
    * color.
    */
  /* static member */
  @JSGlobal("BlendOp.Add")
  @js.native
  val Add: typings.sphereEngineBrowser.BlendOp = js.native
  
  /**
    * Average blend: The components of the source and destination colors are averaged, producing
    * a 50/50 blend of the two colors.
    */
  /* static member */
  @JSGlobal("BlendOp.Average")
  @js.native
  val Average: typings.sphereEngineBrowser.BlendOp = js.native
  
  /**
    * Basic Alpha blend: The final color is a weighted average of the source and destination
    * colors based on the Alpha component of the source color.
    */
  /* static member */
  @JSGlobal("BlendOp.Default")
  @js.native
  val Default: typings.sphereEngineBrowser.BlendOp = js.native
  
  /**
    * Multiply blend: The components of the source and destination colors are multiplied together.
    */
  /* static member */
  @JSGlobal("BlendOp.Multiply")
  @js.native
  val Multiply: typings.sphereEngineBrowser.BlendOp = js.native
  
  /**
    * Replace mode: The contents of the destination surface are ignored and the components of the
    * source color are written as-is.
    */
  /* static member */
  @JSGlobal("BlendOp.Replace")
  @js.native
  val Replace: typings.sphereEngineBrowser.BlendOp = js.native
  
  /**
    * Subtractive blend: The components of the source color are subtracted from those of the
    * destination color.
    */
  /* static member */
  @JSGlobal("BlendOp.Subtract")
  @js.native
  val Subtract: typings.sphereEngineBrowser.BlendOp = js.native
}
