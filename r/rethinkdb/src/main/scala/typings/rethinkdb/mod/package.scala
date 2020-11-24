package typings.rethinkdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExpressionFunction[U] = js.Function1[
    /* doc */ typings.rethinkdb.mod.Expression[js.Any], 
    typings.rethinkdb.mod.Expression[U]
  ]
  
  type IndexFunction[U] = typings.rethinkdb.mod.Expression[U] | js.Array[typings.rethinkdb.mod.Expression[U]] | (js.Function1[
    /* doc */ typings.rethinkdb.mod.Expression[js.Any], 
    typings.rethinkdb.mod.Expression[U] | js.Array[typings.rethinkdb.mod.Expression[U]]
  ])
  
  type JoinFunction[U] = js.Function2[
    /* left */ typings.rethinkdb.mod.Expression[js.Any], 
    /* right */ typings.rethinkdb.mod.Expression[js.Any], 
    typings.rethinkdb.mod.Expression[U]
  ]
  
  type Polygon_ = typings.rethinkdb.mod.Geometry
  
  type ReduceFunction[U] = js.Function2[
    /* acc */ typings.rethinkdb.mod.Expression[js.Any], 
    /* val */ typings.rethinkdb.mod.Expression[js.Any], 
    typings.rethinkdb.mod.Expression[U]
  ]
  
  /**
    * An error has occurred within the driver. This may be a driver bug, or it may
    * be an unfulfillable command, such as an unserializable query.
    *
    * See https://www.rethinkdb.com/docs/error-types/
    */
  type ReqlDriverError = typings.rethinkdb.mod.ReqlError
  
  type ReqlError = typings.std.Error
}
