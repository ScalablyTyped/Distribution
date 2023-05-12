package typings.rcResizeObserver

import typings.rcResizeObserver.mod.OnResize
import typings.rcResizeObserver.mod.SizeInfo
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<rc-resize-observer.rc-resize-observer.ResizeObserverProps & react.react.RefAttributes<any>> */
  trait PartialResizeObserverProp extends StObject {
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* ref */ RefObject[Any], ReactElement])] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var onResize: js.UndefOr[OnResize] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object PartialResizeObserverProp {
    
    inline def apply(): PartialResizeObserverProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialResizeObserverProp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialResizeObserverProp] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* ref */ RefObject[Any], ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ref */ RefObject[Any] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnResize(value: (/* size */ SizeInfo, /* element */ HTMLElement) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Inlined react.react.WeakValidationMap<rc-resize-observer.rc-resize-observer.ResizeObserverProps & react.react.RefAttributes<any>> */
  trait WeakValidationMapResizeOb extends StObject {
    
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement ? react.react.Validator<react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement | null | undefined> : undefined extends react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement ? react.react.Validator<react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement | null | undefined> : react.react.Validator<react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement> */ js.Any
      ] = js.undefined
    
    var data: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : undefined extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : react.react.Validator<any | undefined> */ js.Any
      ] = js.undefined
    
    var disabled: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var key: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ] = js.undefined
    
    var onResize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-resize-observer.rc-resize-observer.OnResize | undefined ? react.react.Validator<rc-resize-observer.rc-resize-observer.OnResize | undefined | null | undefined> : undefined extends rc-resize-observer.rc-resize-observer.OnResize | undefined ? react.react.Validator<rc-resize-observer.rc-resize-observer.OnResize | undefined | null | undefined> : react.react.Validator<rc-resize-observer.rc-resize-observer.OnResize | undefined> */ js.Any
      ] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<any> | undefined ? react.react.Validator<react.react.Ref<any> | undefined | null | undefined> : undefined extends react.react.Ref<any> | undefined ? react.react.Validator<react.react.Ref<any> | undefined | null | undefined> : react.react.Validator<react.react.Ref<any> | undefined> */ js.Any
      ] = js.undefined
  }
  object WeakValidationMapResizeOb {
    
    inline def apply(): WeakValidationMapResizeOb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapResizeOb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeakValidationMapResizeOb] (val x: Self) extends AnyVal {
      
      inline def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement ? react.react.Validator<react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement | null | undefined> : undefined extends react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement ? react.react.Validator<react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement | null | undefined> : react.react.Validator<react.react.ReactNode | (ref : react.react.RefObject<any>): react.react.ReactElement> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : undefined extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : react.react.Validator<any | undefined> */ js.Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisabled(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnResize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-resize-observer.rc-resize-observer.OnResize | undefined ? react.react.Validator<rc-resize-observer.rc-resize-observer.OnResize | undefined | null | undefined> : undefined extends rc-resize-observer.rc-resize-observer.OnResize | undefined ? react.react.Validator<rc-resize-observer.rc-resize-observer.OnResize | undefined | null | undefined> : react.react.Validator<rc-resize-observer.rc-resize-observer.OnResize | undefined> */ js.Any
      ): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<any> | undefined ? react.react.Validator<react.react.Ref<any> | undefined | null | undefined> : undefined extends react.react.Ref<any> | undefined ? react.react.Validator<react.react.Ref<any> | undefined | null | undefined> : react.react.Validator<react.react.Ref<any> | undefined> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
