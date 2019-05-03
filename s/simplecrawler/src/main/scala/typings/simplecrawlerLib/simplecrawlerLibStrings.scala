package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object simplecrawlerLibStrings {
  @js.native
  sealed trait CONNECT
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait DELETE
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait GET
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait HEAD
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait OPTIONS
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait PATCH
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait POST
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait PUT
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait TRACE
    extends simplecrawlerLib.crawlerMod.HTTPMethods
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait cookieerror extends js.Object
  
  @js.native
  sealed trait crawlstart extends js.Object
  
  @js.native
  sealed trait discoverycomplete extends js.Object
  
  @js.native
  sealed trait downloadconditionerror extends js.Object
  
  @js.native
  sealed trait downloaded
    extends simplecrawlerLib.queueMod.QueueItemStatus
  
  @js.native
  sealed trait downloadprevented extends js.Object
  
  @js.native
  sealed trait failed
    extends simplecrawlerLib.queueMod.QueueItemStatus
  
  @js.native
  sealed trait fetch404 extends js.Object
  
  @js.native
  sealed trait fetch410 extends js.Object
  
  @js.native
  sealed trait fetchclienterror extends js.Object
  
  @js.native
  sealed trait fetchcomplete extends js.Object
  
  @js.native
  sealed trait fetchconditionerror extends js.Object
  
  @js.native
  sealed trait fetchdataerror extends js.Object
  
  @js.native
  sealed trait fetchdisallowed extends js.Object
  
  @js.native
  sealed trait fetcherror extends js.Object
  
  @js.native
  sealed trait fetchheaders extends js.Object
  
  @js.native
  sealed trait fetchprevented extends js.Object
  
  @js.native
  sealed trait fetchredirect extends js.Object
  
  @js.native
  sealed trait fetchstart extends js.Object
  
  @js.native
  sealed trait fetchtimeout extends js.Object
  
  @js.native
  sealed trait gziperror extends js.Object
  
  @js.native
  sealed trait headers
    extends simplecrawlerLib.queueMod.QueueItemStatus
  
  @js.native
  sealed trait invaliddomain extends js.Object
  
  @js.native
  sealed trait notfound
    extends simplecrawlerLib.queueMod.QueueItemStatus
  
  @js.native
  sealed trait notmodified extends js.Object
  
  @js.native
  sealed trait queueadd extends js.Object
  
  @js.native
  sealed trait queued
    extends simplecrawlerLib.queueMod.QueueItemStatus
  
  @js.native
  sealed trait queueduplicate extends js.Object
  
  @js.native
  sealed trait queueerror extends js.Object
  
  @js.native
  sealed trait redirected
    extends simplecrawlerLib.queueMod.QueueItemStatus
  
  @js.native
  sealed trait robotstxterror extends js.Object
  
  @js.native
  sealed trait spooled
    extends simplecrawlerLib.queueMod.QueueItemStatus
  
  @scala.inline
  def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
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
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def cookieerror: cookieerror = "cookieerror".asInstanceOf[cookieerror]
  @scala.inline
  def crawlstart: crawlstart = "crawlstart".asInstanceOf[crawlstart]
  @scala.inline
  def discoverycomplete: discoverycomplete = "discoverycomplete".asInstanceOf[discoverycomplete]
  @scala.inline
  def downloadconditionerror: downloadconditionerror = "downloadconditionerror".asInstanceOf[downloadconditionerror]
  @scala.inline
  def downloaded: downloaded = "downloaded".asInstanceOf[downloaded]
  @scala.inline
  def downloadprevented: downloadprevented = "downloadprevented".asInstanceOf[downloadprevented]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fetch404: fetch404 = "fetch404".asInstanceOf[fetch404]
  @scala.inline
  def fetch410: fetch410 = "fetch410".asInstanceOf[fetch410]
  @scala.inline
  def fetchclienterror: fetchclienterror = "fetchclienterror".asInstanceOf[fetchclienterror]
  @scala.inline
  def fetchcomplete: fetchcomplete = "fetchcomplete".asInstanceOf[fetchcomplete]
  @scala.inline
  def fetchconditionerror: fetchconditionerror = "fetchconditionerror".asInstanceOf[fetchconditionerror]
  @scala.inline
  def fetchdataerror: fetchdataerror = "fetchdataerror".asInstanceOf[fetchdataerror]
  @scala.inline
  def fetchdisallowed: fetchdisallowed = "fetchdisallowed".asInstanceOf[fetchdisallowed]
  @scala.inline
  def fetcherror: fetcherror = "fetcherror".asInstanceOf[fetcherror]
  @scala.inline
  def fetchheaders: fetchheaders = "fetchheaders".asInstanceOf[fetchheaders]
  @scala.inline
  def fetchprevented: fetchprevented = "fetchprevented".asInstanceOf[fetchprevented]
  @scala.inline
  def fetchredirect: fetchredirect = "fetchredirect".asInstanceOf[fetchredirect]
  @scala.inline
  def fetchstart: fetchstart = "fetchstart".asInstanceOf[fetchstart]
  @scala.inline
  def fetchtimeout: fetchtimeout = "fetchtimeout".asInstanceOf[fetchtimeout]
  @scala.inline
  def gziperror: gziperror = "gziperror".asInstanceOf[gziperror]
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  @scala.inline
  def invaliddomain: invaliddomain = "invaliddomain".asInstanceOf[invaliddomain]
  @scala.inline
  def notfound: notfound = "notfound".asInstanceOf[notfound]
  @scala.inline
  def notmodified: notmodified = "notmodified".asInstanceOf[notmodified]
  @scala.inline
  def queueadd: queueadd = "queueadd".asInstanceOf[queueadd]
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  @scala.inline
  def queueduplicate: queueduplicate = "queueduplicate".asInstanceOf[queueduplicate]
  @scala.inline
  def queueerror: queueerror = "queueerror".asInstanceOf[queueerror]
  @scala.inline
  def redirected: redirected = "redirected".asInstanceOf[redirected]
  @scala.inline
  def robotstxterror: robotstxterror = "robotstxterror".asInstanceOf[robotstxterror]
  @scala.inline
  def spooled: spooled = "spooled".asInstanceOf[spooled]
}

