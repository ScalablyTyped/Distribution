package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.SketchContext
import typings.reactSketchapp.libTypesMod.SketchDocument
import typings.reactSketchapp.libTypesMod.SketchDocumentData
import typings.reactSketchapp.libTypesMod.WrappedSketchDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetDocumentMod {
  
  @JSImport("react-sketchapp/lib/utils/getDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocument(): js.UndefOr[SketchDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[js.UndefOr[SketchDocument]]
  inline def getDocument(document: SketchDocument): js.UndefOr[SketchDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(document.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SketchDocument]]
  inline def getDocument(document: SketchDocumentData): js.UndefOr[SketchDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(document.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SketchDocument]]
  inline def getDocument(document: WrappedSketchDocument): js.UndefOr[SketchDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(document.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SketchDocument]]
  
  inline def getDocumentData(): js.UndefOr[SketchDocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentData")().asInstanceOf[js.UndefOr[SketchDocumentData]]
  inline def getDocumentData(document: SketchDocument): js.UndefOr[SketchDocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentData")(document.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SketchDocumentData]]
  inline def getDocumentData(document: SketchDocumentData): js.UndefOr[SketchDocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentData")(document.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SketchDocumentData]]
  inline def getDocumentData(document: WrappedSketchDocument): js.UndefOr[SketchDocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentData")(document.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SketchDocumentData]]
  
  inline def getDocumentDataFromContainer(): SketchDocumentData = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentDataFromContainer")().asInstanceOf[SketchDocumentData]
  inline def getDocumentDataFromContainer(container: Any): SketchDocumentData = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentDataFromContainer")(container.asInstanceOf[js.Any]).asInstanceOf[SketchDocumentData]
  
  inline def getDocumentDataFromContext(ctx: SketchContext): SketchDocumentData = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentDataFromContext")(ctx.asInstanceOf[js.Any]).asInstanceOf[SketchDocumentData]
}
