package typings.sassEmbedded

import typings.sassEmbedded.anon.Brackets
import typings.sassEmbedded.distTypesValueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValueListMod {
  
  @JSImport("sass-embedded/dist/types/value/list", "SassList")
  @js.native
  /**
    * Creates an empty list.
    *
    * @param options.separator - The separator to use between elements of this
    * list. Defaults to `','`.
    *
    * @param options.brackets - Whether the list has square brackets. Defaults to
    * `false`.
    */
  open class SassList () extends Value {
    /**
      * Creates a new list.
      *
      * @param contents - The contents of the list. This may be either a plain
      * JavaScript array or an immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param options.separator - The separator to use between elements of this
      * list. Defaults to `','`.
      *
      * @param options.brackets - Whether the list has square brackets. Defaults to
      * `false`.
      */
    def this(contents: js.Array[Value]) = this()
    def this(contents: typings.immutable.mod.List[Value]) = this()
    def this(options: Brackets) = this()
    def this(contents: js.Array[Value], options: Brackets) = this()
    def this(contents: typings.immutable.mod.List[Value], options: Brackets) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sassEmbedded.sassEmbeddedStrings.Comma
    - typings.sassEmbedded.sassEmbeddedStrings.Slash
    - typings.sassEmbedded.sassEmbeddedStrings.Space
    - scala.Null
  */
  type ListSeparator = _ListSeparator | Null
  
  trait _ListSeparator extends StObject
}
