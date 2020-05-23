package typings.rdflib

import typings.rdflib.fetcherMod.HTTPMethods
import typings.rdflib.fetcherMod._StatusValues
import typings.rdflib.typesMod.ContentType
import typings.rdflib.typesMod.TermType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rdflibStrings {
  @js.native
  sealed trait BlankNode extends TermType
  
  @js.native
  sealed trait CONNECT extends HTTPMethods
  
  @js.native
  sealed trait Collection extends TermType
  
  @js.native
  sealed trait DELETE extends HTTPMethods
  
  @js.native
  sealed trait DefaultGraph extends TermType
  
  @js.native
  sealed trait Empty extends TermType
  
  @js.native
  sealed trait FunctionalProperty extends js.Object
  
  @js.native
  sealed trait GET extends HTTPMethods
  
  @js.native
  sealed trait Graph extends TermType
  
  @js.native
  sealed trait HEAD extends HTTPMethods
  
  @js.native
  sealed trait InverseFunctionalProperty extends js.Object
  
  @js.native
  sealed trait Literal extends TermType
  
  @js.native
  sealed trait NamedNode extends TermType
  
  @js.native
  sealed trait OPTIONS extends HTTPMethods
  
  @js.native
  sealed trait PATCH extends HTTPMethods
  
  @js.native
  sealed trait POST extends HTTPMethods
  
  @js.native
  sealed trait PUT extends HTTPMethods
  
  @js.native
  sealed trait TRACE extends HTTPMethods
  
  @js.native
  sealed trait Variable extends TermType
  
  @js.native
  sealed trait _Colon extends js.Object
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait applicationSlashldPlussignjson extends ContentType
  
  @js.native
  sealed trait `applicationSlashn-quads` extends ContentType
  
  @js.native
  sealed trait `applicationSlashn-triples` extends js.Object
  
  @js.native
  sealed trait applicationSlashn3 extends ContentType
  
  @js.native
  sealed trait applicationSlashnquads extends ContentType
  
  @js.native
  sealed trait applicationSlashrdfPlussignxml extends ContentType
  
  @js.native
  sealed trait `applicationSlashsparql-update` extends ContentType
  
  @js.native
  sealed trait `applicationSlashx-turtle` extends ContentType
  
  @js.native
  sealed trait applicationSlashxhtmlPlussignxml extends ContentType
  
  @js.native
  sealed trait delete_ extends js.Object
  
  @js.native
  sealed trait done extends _StatusValues
  
  @js.native
  sealed trait failed extends _StatusValues
  
  @js.native
  sealed trait include extends js.Object
  
  @js.native
  sealed trait omit extends js.Object
  
  @js.native
  sealed trait parse_error extends _StatusValues
  
  @js.native
  sealed trait redirected extends _StatusValues
  
  @js.native
  sealed trait sameAs extends js.Object
  
  @js.native
  sealed trait textSlashhtml extends ContentType
  
  @js.native
  sealed trait textSlashn3 extends ContentType
  
  @js.native
  sealed trait textSlashturtle extends ContentType
  
  @js.native
  sealed trait timeout extends _StatusValues
  
  @js.native
  sealed trait `two-direction` extends js.Object
  
  @js.native
  sealed trait unsupported_protocol extends _StatusValues
  
  @scala.inline
  def BlankNode: BlankNode = "BlankNode".asInstanceOf[BlankNode]
  @scala.inline
  def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  @scala.inline
  def Collection: Collection = "Collection".asInstanceOf[Collection]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def DefaultGraph: DefaultGraph = "DefaultGraph".asInstanceOf[DefaultGraph]
  @scala.inline
  def Empty: Empty = "Empty".asInstanceOf[Empty]
  @scala.inline
  def FunctionalProperty: FunctionalProperty = "FunctionalProperty".asInstanceOf[FunctionalProperty]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def Graph: Graph = "Graph".asInstanceOf[Graph]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def InverseFunctionalProperty: InverseFunctionalProperty = "InverseFunctionalProperty".asInstanceOf[InverseFunctionalProperty]
  @scala.inline
  def Literal: Literal = "Literal".asInstanceOf[Literal]
  @scala.inline
  def NamedNode: NamedNode = "NamedNode".asInstanceOf[NamedNode]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  @scala.inline
  def _Colon: _Colon = "_:".asInstanceOf[_Colon]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def applicationSlashldPlussignjson: applicationSlashldPlussignjson = "application/ld+json".asInstanceOf[applicationSlashldPlussignjson]
  @scala.inline
  def `applicationSlashn-quads`: `applicationSlashn-quads` = "application/n-quads".asInstanceOf[`applicationSlashn-quads`]
  @scala.inline
  def `applicationSlashn-triples`: `applicationSlashn-triples` = "application/n-triples".asInstanceOf[`applicationSlashn-triples`]
  @scala.inline
  def applicationSlashn3: applicationSlashn3 = "application/n3".asInstanceOf[applicationSlashn3]
  @scala.inline
  def applicationSlashnquads: applicationSlashnquads = "application/nquads".asInstanceOf[applicationSlashnquads]
  @scala.inline
  def applicationSlashrdfPlussignxml: applicationSlashrdfPlussignxml = "application/rdf+xml".asInstanceOf[applicationSlashrdfPlussignxml]
  @scala.inline
  def `applicationSlashsparql-update`: `applicationSlashsparql-update` = "application/sparql-update".asInstanceOf[`applicationSlashsparql-update`]
  @scala.inline
  def `applicationSlashx-turtle`: `applicationSlashx-turtle` = "application/x-turtle".asInstanceOf[`applicationSlashx-turtle`]
  @scala.inline
  def applicationSlashxhtmlPlussignxml: applicationSlashxhtmlPlussignxml = "application/xhtml+xml".asInstanceOf[applicationSlashxhtmlPlussignxml]
  @scala.inline
  def delete_ : delete_ = "delete".asInstanceOf[delete_]
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def include: include = "include".asInstanceOf[include]
  @scala.inline
  def omit: omit = "omit".asInstanceOf[omit]
  @scala.inline
  def parse_error: parse_error = "parse_error".asInstanceOf[parse_error]
  @scala.inline
  def redirected: redirected = "redirected".asInstanceOf[redirected]
  @scala.inline
  def sameAs: sameAs = "sameAs".asInstanceOf[sameAs]
  @scala.inline
  def textSlashhtml: textSlashhtml = "text/html".asInstanceOf[textSlashhtml]
  @scala.inline
  def textSlashn3: textSlashn3 = "text/n3".asInstanceOf[textSlashn3]
  @scala.inline
  def textSlashturtle: textSlashturtle = "text/turtle".asInstanceOf[textSlashturtle]
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  @scala.inline
  def `two-direction`: `two-direction` = "two-direction".asInstanceOf[`two-direction`]
  @scala.inline
  def unsupported_protocol: unsupported_protocol = "unsupported_protocol".asInstanceOf[unsupported_protocol]
}

