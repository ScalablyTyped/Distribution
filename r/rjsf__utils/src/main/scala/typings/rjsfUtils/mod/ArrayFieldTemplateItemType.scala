package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties of each element in the ArrayFieldTemplateProps.items array */
trait ArrayFieldTemplateItemType[T, F] extends StObject {
  
  /** The html for the item's content */
  var children: ReactElement
  
  /** The className string */
  var className: String
  
  /** A boolean value stating if the array item is disabled */
  var disabled: Boolean
  
  /** A boolean value stating whether the array item can be moved down */
  var hasMoveDown: Boolean
  
  /** A boolean value stating whether the array item can be moved up */
  var hasMoveUp: Boolean
  
  /** A boolean value stating whether the array item can be removed */
  var hasRemove: Boolean
  
  /** A boolean value stating whether the array item has a toolbar */
  var hasToolbar: Boolean
  
  /** A number stating the index the array item occurs in `items` */
  var index: Double
  
  /** A stable, unique key for the array item */
  var key: String
  
  /** Returns a function that adds a new item at `index` */
  def onAddIndexClick(index: Double): js.Function1[/* event */ js.UndefOr[Any], Unit]
  
  /** Returns a function that removes the item at `index` */
  def onDropIndexClick(index: Double): js.Function1[/* event */ js.UndefOr[Any], Unit]
  
  /** Returns a function that swaps the items at `index` with `newIndex` */
  def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.UndefOr[Any], Unit]
  
  /** A boolean value stating if the array item is read-only */
  var readonly: Boolean
  
  /** The `registry` object */
  var registry: Registry[T, F]
  
  /** The uiSchema object for this field */
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object ArrayFieldTemplateItemType {
  
  inline def apply[T, F](
    children: ReactElement,
    className: String,
    disabled: Boolean,
    hasMoveDown: Boolean,
    hasMoveUp: Boolean,
    hasRemove: Boolean,
    hasToolbar: Boolean,
    index: Double,
    key: String,
    onAddIndexClick: Double => js.Function1[/* event */ js.UndefOr[Any], Unit],
    onDropIndexClick: Double => js.Function1[/* event */ js.UndefOr[Any], Unit],
    onReorderClick: (Double, Double) => js.Function1[/* event */ js.UndefOr[Any], Unit],
    readonly: Boolean,
    registry: Registry[T, F]
  ): ArrayFieldTemplateItemType[T, F] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasMoveDown = hasMoveDown.asInstanceOf[js.Any], hasMoveUp = hasMoveUp.asInstanceOf[js.Any], hasRemove = hasRemove.asInstanceOf[js.Any], hasToolbar = hasToolbar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onAddIndexClick = js.Any.fromFunction1(onAddIndexClick), onDropIndexClick = js.Any.fromFunction1(onDropIndexClick), onReorderClick = js.Any.fromFunction2(onReorderClick), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldTemplateItemType[T, F]]
  }
  
  extension [Self <: ArrayFieldTemplateItemType[?, ?], T, F](x: Self & (ArrayFieldTemplateItemType[T, F])) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHasMoveDown(value: Boolean): Self = StObject.set(x, "hasMoveDown", value.asInstanceOf[js.Any])
    
    inline def setHasMoveUp(value: Boolean): Self = StObject.set(x, "hasMoveUp", value.asInstanceOf[js.Any])
    
    inline def setHasRemove(value: Boolean): Self = StObject.set(x, "hasRemove", value.asInstanceOf[js.Any])
    
    inline def setHasToolbar(value: Boolean): Self = StObject.set(x, "hasToolbar", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnAddIndexClick(value: Double => js.Function1[/* event */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onAddIndexClick", js.Any.fromFunction1(value))
    
    inline def setOnDropIndexClick(value: Double => js.Function1[/* event */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onDropIndexClick", js.Any.fromFunction1(value))
    
    inline def setOnReorderClick(value: (Double, Double) => js.Function1[/* event */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onReorderClick", js.Any.fromFunction2(value))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
