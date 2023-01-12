package typings.reefjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reefjs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Reef {
    /**
      * Create a new Reef() instance, passing in two arguments: your selector, and your options.
      *
      * @param elem - The first argument is the selector for the element you want to render the UI into. Alternatively, you can pass in the element itself.
      * @param options - An object of options that can be provided to your component.
      * It requires a template property, as either a string or a function that returns a string, to render into the DOM.
      *
      * {@link https://reefjs.com/getting-started/#3-create-your-component}
      */
    def this(elem: String, options: Options) = this()
    def this(elem: Element, options: Options) = this()
  }
  @JSImport("reefjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("reefjs", "Store")
  @js.native
  open class Store protected () extends StObject {
    /**
      * Creates a Data Store. A Data Store is a special Reef object that holds reactive data you can share with multiple components.
      * Any time you update the data in your Data Store, any components that use the data will also be updated, and will render again if there are any UI changes.
      *
      * @param DataStore - Single object containing data, setters, and getters.
      *
      * {@link https://reefjs.com/advanced/#shared-state-with-data-stores}
      *
      */
    def this(DataStore: typings.reefjs.mod.DataStore) = this()
    
    var data: Record[String, Any] = js.native
    
    /**
      *  Setter function to update data.
      *
      * @param name - Name of setter.
      * @param args - Any required arguments.
      *
      * {@link https://reefjs.com/advanced/#setters}
      *
      */
    def `do`(name: String, args: Any*): Unit = js.native
    
    /**
      *  Getter function to retrieve data.
      *
      * @param name - Name of getter.
      *
      * {@link https://reefjs.com/advanced/#getters}
      *
      */
    def get(name: String): Any = js.native
  }
  
  inline def clone_(data: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  /**
    * This creates a non-reactive copy of your data that won’t affect the state of your component.
    * It can also create an immutable copy of any array or object, not just your component data.
    *
    * @param data - Object or array.
    * @returns Copy of the provided array or object.
    *
    * {@link https://reefjs.com/state-management/#non-reactive-data}
    */
  /* static member */
  inline def clone_(data: Record[String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * By default, Reef fails silently. You can put Reef into debugging mode to expose helpful error message in the Console tab of your browser’s Developer Tools.
    *
    * @param state - Boolean: true or false.
    *
    * {@link https://reefjs.com/advanced/#debugging}
    */
  /* static member */
  inline def debug(state: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def emit(elem: Document, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def emit(elem: Document, name: String, details: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Emits a custom event that you can listen for with addEventListener().
    *
    * @param elem - The element to emit the custom event on.
    * @param name - The name of the custom event.
    * @param details - Details to attach to the event.
    *
    * {@link https://reefjs.com/advanced/#event-hooks}
    */
  /* static member */
  inline def emit(elem: Element, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def emit(elem: Element, name: String, details: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DataStore extends StObject {
    
    var data: Record[String, Any]
    
    var getters: js.UndefOr[StringDictionary[js.Function1[/* data */ Record[String, Any], Any]]] = js.undefined
    
    var setters: js.UndefOr[
        StringDictionary[js.Function2[/* data */ Record[String, Any], /* repeated */ Any, Unit]]
      ] = js.undefined
  }
  object DataStore {
    
    inline def apply(data: Record[String, Any]): DataStore = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataStore] (val x: Self) extends AnyVal {
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGetters(value: StringDictionary[js.Function1[/* data */ Record[String, Any], Any]]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      inline def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      inline def setSetters(value: StringDictionary[js.Function2[/* data */ Record[String, Any], /* repeated */ Any, Unit]]): Self = StObject.set(x, "setters", value.asInstanceOf[js.Any])
      
      inline def setSettersUndefined: Self = StObject.set(x, "setters", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Prevents Cross-Site Scripting (XSS) Attacks. You can disable this feature by setting this option to true.
      */
    var allowHTML: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Associate a nested component with its parent.
      */
    var attachTo: js.UndefOr[Reef] = js.undefined
    
    /**
      * Allows to define state for your components.
      * The data object is automatically encoded and passed into your template function (first argument), so that you can use it to customize your template.
      */
    var data: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * For any Reef component that should be updated when the route changes, add a router property and associate your router component with it.
      */
    var router: js.UndefOr[Router] = js.undefined
    
    /**
      * A Data Store is a special Reef object that holds reactive data that you can share with multiple components.
      * Any time you update the data in your Data Store, any components that use the data will also be updated, and will render again if there are any UI changes.
      */
    var store: js.UndefOr[Store] = js.undefined
    
    /**
      * A string or a function that returns a string, to render into the DOM.
      * Note: when using a router, the element that the template was rendered into becomes the third argument on the template() function.
      */
    var template: String | (js.Function3[
        /* props */ Record[String, Any], 
        /* elemOrRouter */ js.UndefOr[Element | Router], 
        /* elem */ js.UndefOr[Element], 
        String
      ])
  }
  object Options {
    
    inline def apply(
      template: String | (js.Function3[
          /* props */ Record[String, Any], 
          /* elemOrRouter */ js.UndefOr[Element | Router], 
          /* elem */ js.UndefOr[Element], 
          String
        ])
    ): Options = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      inline def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      inline def setAttachTo(value: Reef): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTemplate(
        value: String | (js.Function3[
              /* props */ Record[String, Any], 
              /* elemOrRouter */ js.UndefOr[Element | Router], 
              /* elem */ js.UndefOr[Element], 
              String
            ])
      ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateFunction3(
        value: (/* props */ Record[String, Any], /* elemOrRouter */ js.UndefOr[Element | Router], /* elem */ js.UndefOr[Element]) => String
      ): Self = StObject.set(x, "template", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Reef extends StObject {
    
    var allowHTML: Boolean = js.native
    
    def attach(component: js.Array[Reef]): Unit = js.native
    /**
      * Attach one or more components to another component.
      *
      * @param component - The component(s) to attach.
      *
      * {@link https://reefjs.com/advanced/#attaching-and-detaching-nested-components}
      */
    def attach(component: Reef): Unit = js.native
    
    var attached: js.Array[Reef] = js.native
    
    var data: Record[String, Any] = js.native
    
    var debounce: Double = js.native
    
    def detach(component: js.Array[Reef]): Unit = js.native
    /**
      * Detach one or more linked components from another component.
      *
      * @param component - The component(s) to detach.
      *
      * {@link https://reefjs.com/advanced/#attaching-and-detaching-nested-components}
      */
    def detach(component: Reef): Unit = js.native
    
    var elem: String = js.native
    
    var lagoon: Boolean = js.native
    
    /**
      * Render your component into the DOM.
      *
      * @returns HTML Element.
      *
      * {@link https://reefjs.com/getting-started/#4-render-your-component}
      */
    def render(): Element = js.native
    
    var store: Store = js.native
    
    var template: String | (js.Function3[
        /* props */ js.UndefOr[Record[String, Any]], 
        /* elemOrRouter */ js.UndefOr[Element | Router], 
        /* elem */ js.UndefOr[Element], 
        String
      ]) = js.native
  }
  
  /**
    * Types not provided yet.
    */
  type Router = Any
}
