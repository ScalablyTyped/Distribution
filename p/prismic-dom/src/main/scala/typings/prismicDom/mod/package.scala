package typings.prismicDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HTMLSerializer[T] = js.Function5[
    /* type */ typings.prismicDom.mod.ElementType, 
    /* element */ js.Any, 
    /* text */ java.lang.String | scala.Null, 
    /* children */ js.Array[T], 
    /* index */ scala.Double, 
    T
  ]
}
