package typings.splitting

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param options Configuration options
    * @returns A result object with data about the plugins that ran
    * @example
    * ```html
    * <!-- Initial DOM -->
    * <div data-splitting>ABC</div>
    * <script> Splitting(); </script>
    *
    * <!-- Output -->
    * <div data-splitting class="words chars splitting" style="--word-total:1; --char-total:3;">
    *   <span class="word" data-word="ABC" style="--word-index:0;">
    *     <span class="char" data-char="A" style="--char-index:0;">A</span>
    *     <span class="char" data-char="B" style="--char-index:1;">B</span>
    *     <span class="char" data-char="C" style="--char-index:2;">C</span>
    *   </span>
    * </div>
    * ```
    * @see {@link <https://splitting.js.org/guide.html#basic-usage>}
    */
  inline def apply(): Result = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Result]
  inline def apply(options: Options): Result = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("splitting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a new plugin
    * @param plugin The plugin to add
    */
  inline def add(plugin: Plugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * The same as the normal splitting function, but with a required `content` property.
    * Returns a string of rendered HTML instead of {@link Result}.
    * Intended for use in JS frameworks such as Vue
    * @param options Configuration options
    * @returns Rendered HTML string
    * @example
    * ```html
    * <div v-html="Splitting.html({ content: myContentString, by: 'chars' })"></div>
    * ```
    */
  inline def html(options: HTMLOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait HTMLOptions
    extends StObject
       with Options {
    
    /** An HTML string to use as the splitting target */
    var content: String
  }
  object HTMLOptions {
    
    inline def apply(content: String): HTMLOptions = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTMLOptions] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with /** Any plugin-specific options */
  /* key */ StringDictionary[Any] {
    
    /**
      * The name of the plugin to use
      * @default 'chars'
      */
    var by: js.UndefOr[String] = js.undefined
    
    /**
      * An optional string to prefix the CSS variables with
      * @default null
      */
    var key: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The target element, either a string selector or element(s)
      * @default '[data-splitting]'
      */
    var target: js.UndefOr[String | Element | js.Array[Element] | NodeList] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBy(value: String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTarget(value: String | Element | js.Array[Element] | NodeList): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: Element*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
  
  trait Plugin extends StObject {
    
    /** The name of the plugin */
    var by: String
    
    /** The plugins that must run before this one */
    var depends: js.Array[String]
    
    /** The prefix to use on custom CSS properties */
    var key: String
    
    /**
      * The function to call when the plugin is used.
      * Its return value is added to {@link Result} under a key
      * with the same name as the plugin
      */
    def split(): Any
  }
  object Plugin {
    
    inline def apply(by: String, depends: js.Array[String], key: String, split: () => Any): Plugin = {
      val __obj = js.Dynamic.literal(by = by.asInstanceOf[js.Any], depends = depends.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      inline def setBy(value: String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setDepends(value: js.Array[String]): Self = StObject.set(x, "depends", value.asInstanceOf[js.Any])
      
      inline def setDependsVarargs(value: String*): Self = StObject.set(x, "depends", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: () => Any): Self = StObject.set(x, "split", js.Any.fromFunction0(value))
    }
  }
  
  trait Result
    extends StObject
       with /** Any plugin-specific options */
  /* key */ StringDictionary[Any] {
    
    /** Array of elements by column when using the `cells` or `cellCols` plugin */
    var cellCols: js.UndefOr[js.Array[js.Array[HTMLElement]]] = js.undefined
    
    /** Array of elements by row when using the `cells` or `cellRows` plugin */
    var cellRows: js.UndefOr[js.Array[js.Array[HTMLElement]]] = js.undefined
    
    /** Array of cells when using the `cells`, `cellRows`, or `cellCols` plugin */
    var cells: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    /** Array of chars when using the `char` plugin */
    var chars: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    /** Array of elements by column when using the `cols` or `grid` plugin */
    var cols: js.UndefOr[js.Array[js.Array[HTMLElement]]] = js.undefined
    
    /** Array of elements when using the `items` plugin */
    var items: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    /** Array of elements by line when using the `lines` plugin */
    var lines: js.UndefOr[js.Array[js.Array[HTMLElement]]] = js.undefined
    
    /** Array of elements by row when using the `rows` or `grid` plugin */
    var rows: js.UndefOr[js.Array[js.Array[HTMLElement]]] = js.undefined
    
    /** Array of words when using the `words` or `lines` plugin */
    var words: js.UndefOr[js.Array[HTMLElement]] = js.undefined
  }
  object Result {
    
    inline def apply(): Result = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setCellCols(value: js.Array[js.Array[HTMLElement]]): Self = StObject.set(x, "cellCols", value.asInstanceOf[js.Any])
      
      inline def setCellColsUndefined: Self = StObject.set(x, "cellCols", js.undefined)
      
      inline def setCellColsVarargs(value: js.Array[HTMLElement]*): Self = StObject.set(x, "cellCols", js.Array(value*))
      
      inline def setCellRows(value: js.Array[js.Array[HTMLElement]]): Self = StObject.set(x, "cellRows", value.asInstanceOf[js.Any])
      
      inline def setCellRowsUndefined: Self = StObject.set(x, "cellRows", js.undefined)
      
      inline def setCellRowsVarargs(value: js.Array[HTMLElement]*): Self = StObject.set(x, "cellRows", js.Array(value*))
      
      inline def setCells(value: js.Array[HTMLElement]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: HTMLElement*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setChars(value: js.Array[HTMLElement]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setCharsVarargs(value: HTMLElement*): Self = StObject.set(x, "chars", js.Array(value*))
      
      inline def setCols(value: js.Array[js.Array[HTMLElement]]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setColsVarargs(value: js.Array[HTMLElement]*): Self = StObject.set(x, "cols", js.Array(value*))
      
      inline def setItems(value: js.Array[HTMLElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: HTMLElement*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLines(value: js.Array[js.Array[HTMLElement]]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setLinesVarargs(value: js.Array[HTMLElement]*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setRows(value: js.Array[js.Array[HTMLElement]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: js.Array[HTMLElement]*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setWords(value: js.Array[HTMLElement]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
      
      inline def setWordsVarargs(value: HTMLElement*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
}
