package typings.rootAsn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrBuffer = js.Tuple2[
    scala.Double, 
    typings.std.Uint8Array | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrBuffer */ js.Object
    ])
  ]
  type ArrInput = js.Tuple2[
    java.lang.String | scala.Double, 
    java.lang.String | typings.std.Uint8Array | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrInput */ js.Object
    ])
  ]
  type ArrJson = js.Tuple2[
    java.lang.String, 
    java.lang.String | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrJson */ js.Object
    ])
  ]
  type ElementBuffer = typings.rootAsn1.mod.Element[typings.std.Uint8Array]
  type ElementHex = typings.rootAsn1.mod.Element[java.lang.String]
}
