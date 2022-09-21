package typings.reactSketchapp

import typings.reactSketchapp.moduleTypesMod.SketchDocumentData
import typings.reactSketchapp.moduleTypesMod.SketchPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resetsMod {
  
  @JSImport("react-sketchapp/lib/module/resets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resetDocument(documentData: SketchDocumentData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDocument")(documentData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetLayer(container: SketchDocumentData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLayer")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def resetLayer(container: SketchPage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLayer")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
