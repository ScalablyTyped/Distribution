package typings.slate

import typings.slate.generalMod.GeneralTransforms
import typings.slate.selectionMod.SelectionTransforms
import typings.slate.transformsNodeMod.NodeTransforms
import typings.slate.transformsTextMod.TextTransforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("slate/dist/transforms", "Transforms")
  @js.native
  val Transforms: GeneralTransforms & NodeTransforms & SelectionTransforms & TextTransforms = js.native
}
