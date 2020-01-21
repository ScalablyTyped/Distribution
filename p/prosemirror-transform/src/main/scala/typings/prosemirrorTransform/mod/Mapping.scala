package typings.prosemirrorTransform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "Mapping")
@js.native
/**
  * Create a new mapping with the given position maps.
  */
class Mapping () extends Mappable {
  def this(maps: js.Array[StepMap]) = this()
  /**
    * The starting position in the `maps` array, used when `map` or
    * `mapResult` is called.
    */
  var from: Double = js.native
  /**
    * The step maps in this mapping.
    */
  var maps: js.Array[StepMap] = js.native
  /**
    * The end position in the `maps` array.
    */
  var to: Double = js.native
  /**
    * Add a step map to the end of this mapping. If `mirrors` is
    * given, it should be the index of the step map that is the mirror
    * image of this one.
    */
  def appendMap(map: StepMap): Unit = js.native
  def appendMap(map: StepMap, mirrors: Double): Unit = js.native
  /**
    * Add all the step maps in a given mapping to this one (preserving
    * mirroring information).
    */
  def appendMapping(mapping: Mapping): Unit = js.native
  /**
    * Append the inverse of the given mapping to this one.
    */
  def appendMappingInverted(mapping: Mapping): Unit = js.native
  /**
    * Finds the offset of the step map that mirrors the map at the
    * given offset, in this mapping (as per the second argument to
    * appendMap).
    */
  def getMirror(n: Double): js.UndefOr[Double | Null] = js.native
  /**
    * Create a mapping that maps only through a part of this one.
    */
  def slice(): Mapping = js.native
  def slice(from: Double): Mapping = js.native
  def slice(from: Double, to: Double): Mapping = js.native
}

