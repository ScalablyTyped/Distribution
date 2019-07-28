package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The stamp Descriptor */
@js.native
trait Descriptor
  extends Composable
     with StampitComposable {
  /** A configuration object to be shallowly assigned to Stamps */
  var configuration: js.UndefOr[js.Object] = js.native
  /** A configuration object to be deeply merged to Stamps */
  var deepConfiguration: js.UndefOr[js.Object] = js.native
  /** Deeply merged properties of object instances */
  var deepProperties: js.UndefOr[js.Object] = js.native
  /**
    * Initialization function(s) which will be called per each newly created
    * instance.
    */
  var initializers: js.UndefOr[js.Array[Init]] = js.native
  /**
    * A hash containing methods (functions) of any future created instance.
    */
  var methods: js.UndefOr[js.Object] = js.native
  /**
    * Properties which will shallowly copied into any future created instance.
    */
  var properties: js.UndefOr[js.Object] = js.native
  /** ES5 Property Descriptors applied to object instances */
  var propertyDescriptors: js.UndefOr[js.Object] = js.native
  /** Deeply merged properties of Stamps */
  var staticDeepProperties: js.UndefOr[js.Object] = js.native
  /**
    * Properties which will be mixed to the new and any other stamp which this stamp will be composed with.
    */
  var staticProperties: js.UndefOr[js.Object] = js.native
  /** ES5 Property Descriptors applied to Stamps */
  var staticPropertyDescriptors: js.UndefOr[js.Object] = js.native
  /** Create a new stamp based on this descriptor */
  def apply(composables: Composable*): Stamp = js.native
}

