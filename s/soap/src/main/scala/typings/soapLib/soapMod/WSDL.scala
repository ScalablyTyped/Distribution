package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "WSDL")
@js.native
class WSDL protected () extends js.Object {
  def this(definition: js.Any, uri: java.lang.String) = this()
  def this(definition: js.Any, uri: java.lang.String, options: IOptions) = this()
  var definitions: Definitions = js.native
  var ignoreBaseNameSpaces: scala.Boolean = js.native
  var ignoredNamespaces: js.Array[java.lang.String] = js.native
  var uri: java.lang.String = js.native
  var valueKey: java.lang.String = js.native
  var xmlKey: java.lang.String = js.native
  var xmlnsInEnvelope: java.lang.String = js.native
  def describeServices(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def filterOutIgnoredNameSpace(ns: java.lang.String): java.lang.String = js.native
  def findChildSchemaObject(parameterTypeObj: js.Any, childName: js.Any): js.Any = js.native
  def findChildSchemaObject(parameterTypeObj: js.Any, childName: js.Any, backtrace: js.Any): js.Any = js.native
  def findSchemaObject(nsURI: java.lang.String, qname: java.lang.String): js.UndefOr[XsdElement | scala.Null] = js.native
  def findSchemaType(name: js.Any, nsURI: js.Any): js.Any = js.native
  def isIgnoredNameSpace(ns: java.lang.String): scala.Boolean = js.native
  def objectToDocumentXML(name: java.lang.String, params: js.Any): js.Any = js.native
  def objectToDocumentXML(name: java.lang.String, params: js.Any, nsPrefix: java.lang.String): js.Any = js.native
  def objectToDocumentXML(name: java.lang.String, params: js.Any, nsPrefix: java.lang.String, nsURI: java.lang.String): js.Any = js.native
  def objectToDocumentXML(
    name: java.lang.String,
    params: js.Any,
    nsPrefix: java.lang.String,
    nsURI: java.lang.String,
    `type`: java.lang.String
  ): js.Any = js.native
  def objectToRpcXML(name: java.lang.String, params: js.Any): java.lang.String = js.native
  def objectToRpcXML(name: java.lang.String, params: js.Any, nsPrefix: java.lang.String): java.lang.String = js.native
  def objectToRpcXML(name: java.lang.String, params: js.Any, nsPrefix: java.lang.String, nsURI: java.lang.String): java.lang.String = js.native
  def objectToRpcXML(
    name: java.lang.String,
    params: js.Any,
    nsPrefix: java.lang.String,
    nsURI: java.lang.String,
    isParts: js.Any
  ): java.lang.String = js.native
  def objectToXML(
    obj: js.Any,
    name: java.lang.String,
    nsPrefix: js.UndefOr[js.Any],
    nsURI: js.UndefOr[java.lang.String],
    isFirst: js.UndefOr[scala.Boolean],
    xmlnsAttr: js.UndefOr[js.Any],
    schemaObject: js.UndefOr[js.Any],
    nsContext: js.UndefOr[js.Any]
  ): java.lang.String = js.native
  def onReady(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def processAttributes(child: js.Any, nsContext: js.Any): java.lang.String = js.native
  def processIncludes(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def toXML(): java.lang.String = js.native
  def xmlToObject(xml: js.Any): js.Any = js.native
  def xmlToObject(xml: js.Any, callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]): js.Any = js.native
}

