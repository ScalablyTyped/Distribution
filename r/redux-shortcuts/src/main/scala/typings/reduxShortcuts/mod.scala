package typings.reduxShortcuts

import org.scalablytyped.runtime.Shortcut
import typings.mousetrap.mod.MousetrapInstance
import typings.mousetrap.mod.MousetrapStatic
import typings.redux.mod.Action
import typings.redux.mod.ActionCreator
import typings.redux.mod.Dispatch
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-shortcuts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Mousetrap_ extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("redux-shortcuts", "Mousetrap")
    @js.native
    open class ^ ()
      extends StObject
         with MousetrapInstance {
      def this(el: Element) = this()
    }
    
    @JSImport("redux-shortcuts", "Mousetrap")
    @js.native
    val ^ : js.Object & MousetrapStatic = js.native
    
    type _To = js.Object & MousetrapStatic
    
    /* This means you don't have to write `^`, but can instead just say `Mousetrap_.foo` */
    override def _to: js.Object & MousetrapStatic = ^
  }
  
  inline def bindShortcut(keys: KeyBindings, actionCreator: ActionBindings): js.Function1[/* dispatch */ Dispatch[Any], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindShortcut")(keys.asInstanceOf[js.Any], actionCreator.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* dispatch */ Dispatch[Any], Unit]]
  inline def bindShortcut(keys: KeyBindings, actionCreator: ActionBindings, preventDefault: Boolean): js.Function1[/* dispatch */ Dispatch[Any], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindShortcut")(keys.asInstanceOf[js.Any], actionCreator.asInstanceOf[js.Any], preventDefault.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* dispatch */ Dispatch[Any], Unit]]
  
  inline def bindShortcuts(shortcut: ShortcutDefinition*): js.Function1[/* dispatch */ Dispatch[Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindShortcuts")(shortcut.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* dispatch */ Dispatch[Any], Unit]]
  
  @JSImport("redux-shortcuts", "mousetrap")
  @js.native
  val mousetrap: MousetrapInstance = js.native
  
  type ActionBindings = ActionCreator[Action[Any]] | js.Array[ActionCreator[Action[Any]]]
  
  type BasicShortcutDefinition = js.Tuple2[KeyBindings, ActionBindings]
  
  type KeyBindings = String | js.Array[String]
  
  type ShortcutDefinition = BasicShortcutDefinition | ShortcutDefinitionWithPreventDefault
  
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[KeyBindings, ActionBindings, Boolean]
}
