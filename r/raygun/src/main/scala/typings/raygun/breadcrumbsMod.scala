package typings.raygun

import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("raygun/build/breadcrumbs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBreadcrumb(breadcrumb: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addBreadcrumb(
    breadcrumb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addBreadcrumb_type(
    breadcrumb: String,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBreadcrumb_type(
    breadcrumb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addRequestBreadcrumb(
    request: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRequestBreadcrumb")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getBreadcrumbs(): (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb */ Any
  ]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbs")().asInstanceOf[(js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb */ Any
  ]) | Null]
  
  inline def runWithBreadcrumbs(f: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runWithBreadcrumbs")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
