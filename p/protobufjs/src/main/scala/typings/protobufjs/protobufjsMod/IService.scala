package typings.protobufjs.protobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.protobufjs.protobufjsMod.AnyNestedObject because Already inherited */ trait IService extends INamespace {
  /** Method descriptors */
  var methods: StringDictionary[IMethod]
}

object IService {
  @scala.inline
  def apply(
    methods: StringDictionary[IMethod],
    nested: StringDictionary[AnyNestedObject] = null,
    options: StringDictionary[js.Any] = null
  ): IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IService]
  }
}

