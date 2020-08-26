package typings.rdflib.typesMod

import typings.rdflib.collectionMod.Collection
import typings.rdflib.factoryTypesMod.DataFactory
import typings.rdflib.factoryTypesMod.Indexable
import typings.rdflib.namedNodeMod.default
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRDFlibDataFactory
  extends DataFactory[
      default | typings.rdflib.blankNodeMod.default | typings.rdflib.literalMod.default | (typings.rdflib.collectionMod.default[
        typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | Collection[js.Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
      ]) | (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]), 
      Indexable
    ] {
  def fetcher(store: typings.rdflib.storeMod.default, options: js.Any): typings.rdflib.fetcherMod.default = js.native
  def graph(): typings.rdflib.storeMod.default = js.native
  def graph(features: js.UndefOr[scala.Nothing], opts: js.Any): typings.rdflib.storeMod.default = js.native
  def graph(features: js.Any): typings.rdflib.storeMod.default = js.native
  def graph(features: js.Any, opts: js.Any): typings.rdflib.storeMod.default = js.native
  def lit(`val`: String): typings.rdflib.literalMod.default = js.native
  def lit(`val`: String, lang: js.UndefOr[scala.Nothing], dt: NamedNode): typings.rdflib.literalMod.default = js.native
  def lit(`val`: String, lang: String): typings.rdflib.literalMod.default = js.native
  def lit(`val`: String, lang: String, dt: NamedNode): typings.rdflib.literalMod.default = js.native
  def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
  def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
}

