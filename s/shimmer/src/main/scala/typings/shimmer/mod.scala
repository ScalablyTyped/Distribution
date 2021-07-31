package typings.shimmer

import typings.shimmer.anon.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: Logger): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("shimmer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def massUnwrap[Nodule /* <: js.Object */](nodules: js.Array[Nodule], names: js.Array[/* keyof Nodule */ String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("massUnwrap")(nodules.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def massWrap[Nodule /* <: js.Object */, FieldName /* <: /* keyof Nodule */ String */](
    nodules: js.Array[Nodule],
    names: js.Array[FieldName],
    wrapper: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("massWrap")(nodules.asInstanceOf[js.Any], names.asInstanceOf[js.Any], wrapper.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unwrap[Nodule /* <: js.Object */](nodule: Nodule, name: /* keyof Nodule */ String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(nodule.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def wrap[Nodule /* <: js.Object */, FieldName /* <: /* keyof Nodule */ String */](
    nodule: Nodule,
    name: FieldName,
    wrapper: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(nodule.asInstanceOf[js.Any], name.asInstanceOf[js.Any], wrapper.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object global {
    
    @js.native
    trait Function extends StObject {
      
      var __wrapped: js.UndefOr[Boolean] = js.native
    }
  }
}
