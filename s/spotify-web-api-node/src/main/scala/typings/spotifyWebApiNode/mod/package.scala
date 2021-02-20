package typings.spotifyWebApiNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[
    /* error */ typings.std.Error, 
    /* response */ typings.spotifyWebApiNode.mod.Response[T], 
    scala.Unit
  ]
}
