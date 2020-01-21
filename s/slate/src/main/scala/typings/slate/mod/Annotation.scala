package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Map
import typings.slate.slateStrings.annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Annotation")
@js.native
class Annotation ()
  extends BaseRange
     with RangeType {
  var anchor: Point = js.native
  var data: Data = js.native
  var focus: Point = js.native
  var key: String = js.native
  var `object`: annotation = js.native
  var `type`: String = js.native
  def setProperties(properties: Annotation): Annotation = js.native
  def setProperties(properties: AnnotationJSON): Annotation = js.native
  def setProperties(properties: AnnotationProperties): Annotation = js.native
}

/* static members */
@JSImport("slate", "Annotation")
@js.native
object Annotation extends js.Object {
  def create(properties: Annotation): Annotation = js.native
  def create(properties: AnnotationJSON): Annotation = js.native
  def create(properties: AnnotationProperties): Annotation = js.native
  def createMap(): Map[String, Annotation] = js.native
  def createMap(elements: StringDictionary[Annotation | AnnotationProperties | AnnotationJSON]): Map[String, Annotation] = js.native
  def createMap(elements: Map[String, Annotation]): Map[String, Annotation] = js.native
  def createProperties(attrs: Annotation): AnnotationProperties = js.native
  def createProperties(attrs: AnnotationJSON): AnnotationProperties = js.native
  def createProperties(attrs: AnnotationProperties): AnnotationProperties = js.native
  def fromJS(properties: AnnotationJSON): Annotation = js.native
  def fromJS(properties: AnnotationProperties): Annotation = js.native
  def fromJSON(properties: AnnotationJSON): Annotation = js.native
  def fromJSON(properties: AnnotationProperties): Annotation = js.native
  def isAnnotation(maybeAnnotation: js.Any): /* is slate.slate.Annotation */ Boolean = js.native
}

