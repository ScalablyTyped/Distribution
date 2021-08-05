package typings.protobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(name: java.lang.String, json: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = (typings.protobufjs.mod.common.^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Gets the root definition of the specified common proto file.
  *
  * Bundled definitions are:
  * - google/protobuf/any.proto
  * - google/protobuf/duration.proto
  * - google/protobuf/empty.proto
  * - google/protobuf/field_mask.proto
  * - google/protobuf/struct.proto
  * - google/protobuf/timestamp.proto
  * - google/protobuf/wrappers.proto
  *
  * @param file Proto file name
  * @returns Root definition or `null` if not defined
  */
inline def get(file: java.lang.String): typings.protobufjs.mod.INamespace | scala.Null = typings.protobufjs.mod.common.^.asInstanceOf[js.Dynamic].applyDynamic("get")(file.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.INamespace | scala.Null]
