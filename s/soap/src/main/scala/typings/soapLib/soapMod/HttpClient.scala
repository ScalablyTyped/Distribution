package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "HttpClient")
@js.native
class HttpClient () extends js.Object {
  def this(options: IOptions) = this()
  def buildRequest(rurl: java.lang.String, data: java.lang.String): js.Any = js.native
  def buildRequest(
    rurl: java.lang.String,
    data: java.lang.String,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def buildRequest(
    rurl: java.lang.String,
    data: java.lang.String,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any],
    exoptions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def buildRequest(rurl: java.lang.String, data: js.Any): js.Any = js.native
  def buildRequest(
    rurl: java.lang.String,
    data: js.Any,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def buildRequest(
    rurl: java.lang.String,
    data: js.Any,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any],
    exoptions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def handleResponse(req: js.Any, res: js.Any, body: java.lang.String): js.Any | java.lang.String = js.native
  def handleResponse(req: js.Any, res: js.Any, body: js.Any): js.Any | java.lang.String = js.native
  def request(
    rurl: java.lang.String,
    data: java.lang.String,
    callback: js.Function3[/* err */ js.Any, /* res */ js.Any, /* body */ js.Any | java.lang.String, scala.Unit]
  ): js.Any = js.native
  def request(
    rurl: java.lang.String,
    data: java.lang.String,
    callback: js.Function3[/* err */ js.Any, /* res */ js.Any, /* body */ js.Any | java.lang.String, scala.Unit],
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def request(
    rurl: java.lang.String,
    data: java.lang.String,
    callback: js.Function3[/* err */ js.Any, /* res */ js.Any, /* body */ js.Any | java.lang.String, scala.Unit],
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any],
    exoptions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def request(
    rurl: java.lang.String,
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* res */ js.Any, /* body */ js.Any | java.lang.String, scala.Unit]
  ): js.Any = js.native
  def request(
    rurl: java.lang.String,
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* res */ js.Any, /* body */ js.Any | java.lang.String, scala.Unit],
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def request(
    rurl: java.lang.String,
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* res */ js.Any, /* body */ js.Any | java.lang.String, scala.Unit],
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any],
    exoptions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def requestStream(rurl: java.lang.String, data: java.lang.String): js.Any = js.native
  def requestStream(
    rurl: java.lang.String,
    data: java.lang.String,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def requestStream(
    rurl: java.lang.String,
    data: java.lang.String,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any],
    exoptions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def requestStream(rurl: java.lang.String, data: js.Any): js.Any = js.native
  def requestStream(
    rurl: java.lang.String,
    data: js.Any,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  def requestStream(
    rurl: java.lang.String,
    data: js.Any,
    exheaders: org.scalablytyped.runtime.StringDictionary[js.Any],
    exoptions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
}

