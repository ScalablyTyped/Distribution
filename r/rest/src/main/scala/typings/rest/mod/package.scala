package typings.rest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Interceptor[T] = js.Function2[
    /* parent */ js.UndefOr[typings.rest.mod.Client], 
    /* config */ js.UndefOr[T], 
    typings.rest.mod.Client
  ]
}
