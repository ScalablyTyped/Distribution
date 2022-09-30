package typings.sassEmbedded

import typings.immutable.mod.OrderedMap
import typings.sassEmbedded.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("sass-embedded/dist/types/value/map", "SassMap")
  @js.native
  /**
    * Creates a new map.
    *
    * @param contents - The contents of the map. This is an immutable
    * [[OrderedMap]] from the [`immutable` package](https://immutable-js.com/).
    * Defaults to an empty map.
    */
  open class SassMap () extends Value {
    def this(contents: OrderedMap[Value, Value]) = this()
    
    /**
      * Returns the contents of this map as an immutable [[OrderedMap]] from the
      * [`immutable` package](https://immutable-js.com/).
      */
    def contents: OrderedMap[Value, Value] = js.native
    
    /**
      * Returns the value associated with `key` in this map, or `undefined` if
      * `key` isn't in the map.
      *
      * This is a shorthand for `this.contents.get(key)`, although it may be more
      * efficient in some cases.
      */
    def get(key: Value): js.UndefOr[Value] = js.native
  }
}
