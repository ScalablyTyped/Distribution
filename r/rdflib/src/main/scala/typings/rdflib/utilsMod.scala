package typings.rdflib

import typings.rdflib.anon.Fetcher
import typings.rdflib.tfTypesMod.Quad
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.tfTypesMod.RdfJsDataFactory
import typings.rdflib.tfTypesMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val appliedFactoryMethods: js.Array[String] = js.native
  @JSName("AJAR_handleNewTerm")
  def AJARHandleNewTerm(kb: Fetcher, p: js.Any, requestedBy: js.Any): js.Any = js.native
  def ArrayIndexOf(arr: js.Any, item: js.Any): Double = js.native
  def ArrayIndexOf(arr: js.Any, item: js.Any, i: Double): Double = js.native
  def arrayToStatements(rdfFactory: RdfJsDataFactory, subject: QuadSubject, data: js.Array[Term]): js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]] = js.native
}

