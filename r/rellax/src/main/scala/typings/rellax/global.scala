package typings.rellax

import org.scalablytyped.runtime.Shortcut
import typings.rellax.mod.RellaxInstance
import typings.rellax.mod.RellaxOptions
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Rellax extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Rellax")
    @js.native
    /**
      * Inits and starts the Parallax animations
      * @param el Single element or string with selector of elements
      * @param options Options
      */
    class ^ ()
      extends StObject
         with RellaxInstance {
      def this(el: String) = this()
      def this(el: Element) = this()
      def this(el: String, options: RellaxOptions) = this()
      def this(el: Unit, options: RellaxOptions) = this()
      def this(el: Element, options: RellaxOptions) = this()
      
      /**
        * End Rellax and reset parallax elements to their original positions
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Rellax elements
        */
      /* CompleteClass */
      var elms: NodeListOf[Element] | js.Array[Element] = js.native
      
      /**
        * Options
        */
      /* CompleteClass */
      var options: RellaxOptions = js.native
      
      /**
        * Destroy and create again parallax with previous settings
        */
      /* CompleteClass */
      override def refresh(): Unit = js.native
    }
    
    @JSGlobal("Rellax")
    @js.native
    val ^ : js.Object & typings.rellax.mod.Rellax = js.native
    
    type _To = js.Object & typings.rellax.mod.Rellax
    
    /* This means you don't have to write `^`, but can instead just say `Rellax.foo` */
    override def _to: js.Object & typings.rellax.mod.Rellax = ^
  }
}
