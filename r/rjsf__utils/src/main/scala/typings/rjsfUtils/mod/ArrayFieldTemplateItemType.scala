package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties of each element in the ArrayFieldTemplateProps.items array */
trait ArrayFieldTemplateItemType[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** A boolean value stating whether new items can be added to the array */
  var canAdd: Boolean
  
  /** The html for the item's content */
  var children: ReactElement
  
  /** The className string */
  var className: String
  
  /** A boolean value stating if the array item is disabled */
  var disabled: Boolean
  
  /** A boolean value stating whether the array item can be copied, assumed false if missing */
  var hasCopy: Boolean
  
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
  
  /** Returns a function that copies the item at `index` into the position at `index + 1` */
  def onCopyIndexClick(index: Double): js.Function1[/* event */ js.UndefOr[Any], Unit]
  
  /** Returns a function that removes the item at `index` */
  def onDropIndexClick(index: Double): js.Function1[/* event */ js.UndefOr[Any], Unit]
  
  /** Returns a function that swaps the items at `index` with `newIndex` */
  def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.UndefOr[Any], Unit]
  
  /** A boolean value stating if the array item is read-only */
  var readonly: Boolean
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The schema object for this array item */
  var schema: S
  
  /** A number stating the total number `items` in the array */
  var totalItems: Double
  
  /** The uiSchema object for this array item */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object ArrayFieldTemplateItemType {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
    canAdd: Boolean,
    children: ReactElement,
    className: String,
    disabled: Boolean,
    hasCopy: Boolean,
    hasMoveDown: Boolean,
    hasMoveUp: Boolean,
    hasRemove: Boolean,
    hasToolbar: Boolean,
    index: Double,
    key: String,
    onAddIndexClick: Double => js.Function1[/* event */ js.UndefOr[Any], Unit],
    onCopyIndexClick: Double => js.Function1[/* event */ js.UndefOr[Any], Unit],
    onDropIndexClick: Double => js.Function1[/* event */ js.UndefOr[Any], Unit],
    onReorderClick: (Double, Double) => js.Function1[/* event */ js.UndefOr[Any], Unit],
    readonly: Boolean,
    registry: Registry[T, S, F],
    schema: S,
    totalItems: Double
  ): ArrayFieldTemplateItemType[T, S, F] = {
    val __obj = js.Dynamic.literal(canAdd = canAdd.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasCopy = hasCopy.asInstanceOf[js.Any], hasMoveDown = hasMoveDown.asInstanceOf[js.Any], hasMoveUp = hasMoveUp.asInstanceOf[js.Any], hasRemove = hasRemove.asInstanceOf[js.Any], hasToolbar = hasToolbar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onAddIndexClick = js.Any.fromFunction1(onAddIndexClick), onCopyIndexClick = js.Any.fromFunction1(onCopyIndexClick), onDropIndexClick = js.Any.fromFunction1(onDropIndexClick), onReorderClick = js.Any.fromFunction2(onReorderClick), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldTemplateItemType[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayFieldTemplateItemType[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (ArrayFieldTemplateItemType[T, S, F])) extends AnyVal {
    
    inline def setCanAdd(value: Boolean): Self = StObject.set(x, "canAdd", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHasCopy(value: Boolean): Self = StObject.set(x, "hasCopy", value.asInstanceOf[js.Any])
    
    inline def setHasMoveDown(value: Boolean): Self = StObject.set(x, "hasMoveDown", value.asInstanceOf[js.Any])
    
    inline def setHasMoveUp(value: Boolean): Self = StObject.set(x, "hasMoveUp", value.asInstanceOf[js.Any])
    
    inline def setHasRemove(value: Boolean): Self = StObject.set(x, "hasRemove", value.asInstanceOf[js.Any])
    
    inline def setHasToolbar(value: Boolean): Self = StObject.set(x, "hasToolbar", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnAddIndexClick(value: Double => js.Function1[/* event */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onAddIndexClick", js.Any.fromFunction1(value))
    
    inline def setOnCopyIndexClick(value: Double => js.Function1[/* event */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onCopyIndexClick", js.Any.fromFunction1(value))
    
    inline def setOnDropIndexClick(value: Double => js.Function1[/* event */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onDropIndexClick", js.Any.fromFunction1(value))
    
    inline def setOnReorderClick(value: (Double, Double) => js.Function1[/* event */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onReorderClick", js.Any.fromFunction2(value))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
