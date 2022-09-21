package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.SketchDocumentData
import typings.reactSketchapp.libTypesMod.SketchPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResetsMod {
  
  @JSImport("react-sketchapp/lib/resets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resetDocument(documentData: SketchDocumentData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDocument")(documentData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetLayer(container: SketchDocumentData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLayer")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def resetLayer(container: SketchPage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLayer")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
