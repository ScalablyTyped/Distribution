package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  def add(docs: js.Array[js.Object]): nodeLib.httpMod.ClientRequest = js.native
  def add(docs: js.Array[js.Object], options: Options): nodeLib.httpMod.ClientRequest = js.native
  def add(
    docs: js.Array[js.Object],
    options: Options,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def addRemoteResource(options: AddRemoteResourceOptions): nodeLib.httpMod.ClientRequest = js.native
  def addRemoteResource(
    options: AddRemoteResourceOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def atomicUpdate(doc: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def atomicUpdate(doc: js.Object, callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def basicAuth(username: java.lang.String, password: java.lang.String): Client = js.native
  def commit(): nodeLib.httpMod.ClientRequest = js.native
  def commit(options: Options): nodeLib.httpMod.ClientRequest = js.native
  def commit(options: Options, callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def delete(field: java.lang.String, text: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def delete(field: java.lang.String, text: java.lang.String, options: Options): nodeLib.httpMod.ClientRequest = js.native
  def delete(
    field: java.lang.String,
    text: java.lang.String,
    options: Options,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def deleteAll(): nodeLib.httpMod.ClientRequest = js.native
  def deleteAll(options: Options): nodeLib.httpMod.ClientRequest = js.native
  def deleteAll(options: Options, callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def deleteByID(id: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def deleteByID(id: java.lang.String, options: Options): nodeLib.httpMod.ClientRequest = js.native
  def deleteByID(
    id: java.lang.String,
    options: Options,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def deleteByID(id: scala.Double): nodeLib.httpMod.ClientRequest = js.native
  def deleteByID(id: scala.Double, options: Options): nodeLib.httpMod.ClientRequest = js.native
  def deleteByID(
    id: scala.Double,
    options: Options,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def deleteByQuery(query: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def deleteByQuery(query: java.lang.String, options: Options): nodeLib.httpMod.ClientRequest = js.native
  def deleteByQuery(
    query: java.lang.String,
    options: Options,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: java.lang.String, stop: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: java.lang.String, stop: java.lang.String, options: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(
    field: java.lang.String,
    start: java.lang.String,
    stop: java.lang.String,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: java.lang.String, stop: stdLib.Date): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: java.lang.String, stop: stdLib.Date, options: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(
    field: java.lang.String,
    start: java.lang.String,
    stop: stdLib.Date,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: stdLib.Date, stop: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: stdLib.Date, stop: java.lang.String, options: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(
    field: java.lang.String,
    start: stdLib.Date,
    stop: java.lang.String,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: stdLib.Date, stop: stdLib.Date): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(field: java.lang.String, start: stdLib.Date, stop: stdLib.Date, options: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def deleteByRange(
    field: java.lang.String,
    start: stdLib.Date,
    stop: stdLib.Date,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def escapeSpecialChars(s: java.lang.String): java.lang.String = js.native
  def executeCollection(collection: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def executeCollection(
    collection: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def executeCollection(collection: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def executeCollection(
    collection: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def executeCollection(collection: Query): nodeLib.httpMod.ClientRequest = js.native
  def executeCollection(
    collection: Query,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(handler: java.lang.String, query: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def get(
    handler: java.lang.String,
    query: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(handler: java.lang.String, query: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def get(
    handler: java.lang.String,
    query: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(handler: java.lang.String, query: Query): nodeLib.httpMod.ClientRequest = js.native
  def get(
    handler: java.lang.String,
    query: Query,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def optimize(options: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def optimize(
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def post(handler: java.lang.String, query: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def post(
    handler: java.lang.String,
    query: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def post(handler: java.lang.String, query: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def post(
    handler: java.lang.String,
    query: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def post(handler: java.lang.String, query: Query): nodeLib.httpMod.ClientRequest = js.native
  def post(
    handler: java.lang.String,
    query: Query,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def prepareCommit(): nodeLib.httpMod.ClientRequest = js.native
  def prepareCommit(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def query(): Query = js.native
  def realTimeGet(ids: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def realTimeGet(ids: java.lang.String, query: Query): nodeLib.httpMod.ClientRequest = js.native
  def realTimeGet(
    ids: java.lang.String,
    query: Query,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def realTimeGet(ids: js.Array[java.lang.String]): nodeLib.httpMod.ClientRequest = js.native
  def realTimeGet(ids: js.Array[java.lang.String], query: Query): nodeLib.httpMod.ClientRequest = js.native
  def realTimeGet(
    ids: js.Array[java.lang.String],
    query: Query,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def rollback(): nodeLib.httpMod.ClientRequest = js.native
  def rollback(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def search(query: Query): nodeLib.httpMod.ClientRequest = js.native
  def search(query: Query, callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def searchAll(): nodeLib.httpMod.ClientRequest = js.native
  def searchAll(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def softCommit(): nodeLib.httpMod.ClientRequest = js.native
  def softCommit(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]): nodeLib.httpMod.ClientRequest = js.native
  def unauth(): Client = js.native
  def update(data: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def update(data: js.Object, options: js.Object): nodeLib.httpMod.ClientRequest = js.native
  def update(
    data: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Object, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
}

