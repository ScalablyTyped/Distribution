package typings.puppeteer

import typings.puppeteer.puppeteerMod.ConsoleMessageType
import typings.puppeteer.puppeteerMod.DialogType
import typings.puppeteer.puppeteerMod.ErrorCode
import typings.puppeteer.puppeteerMod.HttpMethod
import typings.puppeteer.puppeteerMod.LoadEvent
import typings.puppeteer.puppeteerMod.MediaType
import typings.puppeteer.puppeteerMod.MouseButtons
import typings.puppeteer.puppeteerMod.PDFFormat
import typings.puppeteer.puppeteerMod.Permission
import typings.puppeteer.puppeteerMod.Platform
import typings.puppeteer.puppeteerMod.ResourceType
import typings.puppeteer.puppeteerMod.SameSiteSetting
import typings.puppeteer.puppeteerMod.TargetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object puppeteerStrings {
  @js.native
  sealed trait A0 extends PDFFormat
  
  @js.native
  sealed trait A1 extends PDFFormat
  
  @js.native
  sealed trait A2 extends PDFFormat
  
  @js.native
  sealed trait A3 extends PDFFormat
  
  @js.native
  sealed trait A4 extends PDFFormat
  
  @js.native
  sealed trait A5 extends PDFFormat
  
  @js.native
  sealed trait A6 extends PDFFormat
  
  @js.native
  sealed trait DELETE extends HttpMethod
  
  @js.native
  sealed trait GET extends HttpMethod
  
  @js.native
  sealed trait Lax extends SameSiteSetting
  
  @js.native
  sealed trait Ledger extends PDFFormat
  
  @js.native
  sealed trait Legal extends PDFFormat
  
  @js.native
  sealed trait Letter extends PDFFormat
  
  @js.native
  sealed trait OPTIONS extends HttpMethod
  
  @js.native
  sealed trait PATCH extends HttpMethod
  
  @js.native
  sealed trait POST extends HttpMethod
  
  @js.native
  sealed trait PUT extends HttpMethod
  
  @js.native
  sealed trait Strict extends SameSiteSetting
  
  @js.native
  sealed trait Tabloid extends PDFFormat
  
  @js.native
  sealed trait aborted extends ErrorCode
  
  @js.native
  sealed trait accelerometer extends Permission
  
  @js.native
  sealed trait accessdenied extends ErrorCode
  
  @js.native
  sealed trait `accessibility-events` extends Permission
  
  @js.native
  sealed trait addressunreachable extends ErrorCode
  
  @js.native
  sealed trait alert extends DialogType
  
  @js.native
  sealed trait `ambient-light-sensor` extends Permission
  
  @js.native
  sealed trait assert extends ConsoleMessageType
  
  @js.native
  sealed trait `background-sync` extends Permission
  
  @js.native
  sealed trait background_page extends TargetType
  
  @js.native
  sealed trait base64 extends js.Object
  
  @js.native
  sealed trait beforeunload extends DialogType
  
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait blockedbyclient extends ErrorCode
  
  @js.native
  sealed trait blockedbyresponse extends ErrorCode
  
  @js.native
  sealed trait browser extends TargetType
  
  @js.native
  sealed trait camera extends Permission
  
  @js.native
  sealed trait clear extends ConsoleMessageType
  
  @js.native
  sealed trait `clipboard-read` extends Permission
  
  @js.native
  sealed trait `clipboard-write` extends Permission
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait confirm extends DialogType
  
  @js.native
  sealed trait connectionaborted extends ErrorCode
  
  @js.native
  sealed trait connectionclosed extends ErrorCode
  
  @js.native
  sealed trait connectionfailed extends ErrorCode
  
  @js.native
  sealed trait connectionrefused extends ErrorCode
  
  @js.native
  sealed trait connectionreset extends ErrorCode
  
  @js.native
  sealed trait console extends js.Object
  
  @js.native
  sealed trait count extends ConsoleMessageType
  
  @js.native
  sealed trait debug extends ConsoleMessageType
  
  @js.native
  sealed trait dialog extends js.Object
  
  @js.native
  sealed trait dir extends ConsoleMessageType
  
  @js.native
  sealed trait dirxml extends ConsoleMessageType
  
  @js.native
  sealed trait disconnected extends js.Object
  
  @js.native
  sealed trait document extends ResourceType
  
  @js.native
  sealed trait domcontentloaded extends LoadEvent
  
  @js.native
  sealed trait endGroup extends ConsoleMessageType
  
  @js.native
  sealed trait error extends ConsoleMessageType
  
  @js.native
  sealed trait eventsource extends ResourceType
  
  @js.native
  sealed trait failed extends ErrorCode
  
  @js.native
  sealed trait fetch extends ResourceType
  
  @js.native
  sealed trait font extends ResourceType
  
  @js.native
  sealed trait frameattached extends js.Object
  
  @js.native
  sealed trait framedetached extends js.Object
  
  @js.native
  sealed trait framenavigated extends js.Object
  
  @js.native
  sealed trait geolocation extends Permission
  
  @js.native
  sealed trait gyroscope extends Permission
  
  @js.native
  sealed trait image extends ResourceType
  
  @js.native
  sealed trait info extends ConsoleMessageType
  
  @js.native
  sealed trait internetdisconnected extends ErrorCode
  
  @js.native
  sealed trait jpeg extends js.Object
  
  @js.native
  sealed trait left extends MouseButtons
  
  @js.native
  sealed trait linux extends Platform
  
  @js.native
  sealed trait load extends LoadEvent
  
  @js.native
  sealed trait log extends ConsoleMessageType
  
  @js.native
  sealed trait mac extends Platform
  
  @js.native
  sealed trait magnetometer extends Permission
  
  @js.native
  sealed trait manifest extends ResourceType
  
  @js.native
  sealed trait media extends ResourceType
  
  @js.native
  sealed trait metrics extends js.Object
  
  @js.native
  sealed trait microphone extends Permission
  
  @js.native
  sealed trait middle extends MouseButtons
  
  @js.native
  sealed trait midi extends Permission
  
  @js.native
  sealed trait `midi-sysex` extends Permission
  
  @js.native
  sealed trait mixed extends js.Object
  
  @js.native
  sealed trait mutation extends js.Object
  
  @js.native
  sealed trait namenotresolved extends ErrorCode
  
  @js.native
  sealed trait networkidle0 extends LoadEvent
  
  @js.native
  sealed trait networkidle2 extends LoadEvent
  
  @js.native
  sealed trait notifications extends Permission
  
  @js.native
  sealed trait other
    extends ResourceType
       with TargetType
  
  @js.native
  sealed trait page extends TargetType
  
  @js.native
  sealed trait pageerror extends js.Object
  
  @js.native
  sealed trait `payment-handler` extends Permission
  
  @js.native
  sealed trait png extends js.Object
  
  @js.native
  sealed trait popup extends js.Object
  
  @js.native
  sealed trait print extends MediaType
  
  @js.native
  sealed trait profile extends ConsoleMessageType
  
  @js.native
  sealed trait profileEnd extends ConsoleMessageType
  
  @js.native
  sealed trait prompt extends DialogType
  
  @js.native
  sealed trait push extends Permission
  
  @js.native
  sealed trait raf extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait requestfailed extends js.Object
  
  @js.native
  sealed trait requestfinished extends js.Object
  
  @js.native
  sealed trait response extends js.Object
  
  @js.native
  sealed trait right extends MouseButtons
  
  @js.native
  sealed trait screen extends MediaType
  
  @js.native
  sealed trait script extends ResourceType
  
  @js.native
  sealed trait service_worker extends TargetType
  
  @js.native
  sealed trait shared_worker extends TargetType
  
  @js.native
  sealed trait startGroup extends ConsoleMessageType
  
  @js.native
  sealed trait startGroupCollapsed extends ConsoleMessageType
  
  @js.native
  sealed trait stylesheet extends ResourceType
  
  @js.native
  sealed trait table extends ConsoleMessageType
  
  @js.native
  sealed trait targetchanged extends js.Object
  
  @js.native
  sealed trait targetcreated extends js.Object
  
  @js.native
  sealed trait targetdestroyed extends js.Object
  
  @js.native
  sealed trait texttrack extends ResourceType
  
  @js.native
  sealed trait timeEnd extends ConsoleMessageType
  
  @js.native
  sealed trait timedout extends ErrorCode
  
  @js.native
  sealed trait trace extends ConsoleMessageType
  
  @js.native
  sealed trait warning extends ConsoleMessageType
  
  @js.native
  sealed trait websocket extends ResourceType
  
  @js.native
  sealed trait win32 extends Platform
  
  @js.native
  sealed trait win64 extends Platform
  
  @js.native
  sealed trait workercreated extends js.Object
  
  @js.native
  sealed trait workerdestroyed extends js.Object
  
  @js.native
  sealed trait xhr extends ResourceType
  
  @scala.inline
  def A0: A0 = "A0".asInstanceOf[A0]
  @scala.inline
  def A1: A1 = "A1".asInstanceOf[A1]
  @scala.inline
  def A2: A2 = "A2".asInstanceOf[A2]
  @scala.inline
  def A3: A3 = "A3".asInstanceOf[A3]
  @scala.inline
  def A4: A4 = "A4".asInstanceOf[A4]
  @scala.inline
  def A5: A5 = "A5".asInstanceOf[A5]
  @scala.inline
  def A6: A6 = "A6".asInstanceOf[A6]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def Lax: Lax = "Lax".asInstanceOf[Lax]
  @scala.inline
  def Ledger: Ledger = "Ledger".asInstanceOf[Ledger]
  @scala.inline
  def Legal: Legal = "Legal".asInstanceOf[Legal]
  @scala.inline
  def Letter: Letter = "Letter".asInstanceOf[Letter]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def Strict: Strict = "Strict".asInstanceOf[Strict]
  @scala.inline
  def Tabloid: Tabloid = "Tabloid".asInstanceOf[Tabloid]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def accelerometer: accelerometer = "accelerometer".asInstanceOf[accelerometer]
  @scala.inline
  def accessdenied: accessdenied = "accessdenied".asInstanceOf[accessdenied]
  @scala.inline
  def `accessibility-events`: `accessibility-events` = "accessibility-events".asInstanceOf[`accessibility-events`]
  @scala.inline
  def addressunreachable: addressunreachable = "addressunreachable".asInstanceOf[addressunreachable]
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  @scala.inline
  def `ambient-light-sensor`: `ambient-light-sensor` = "ambient-light-sensor".asInstanceOf[`ambient-light-sensor`]
  @scala.inline
  def assert: assert = "assert".asInstanceOf[assert]
  @scala.inline
  def `background-sync`: `background-sync` = "background-sync".asInstanceOf[`background-sync`]
  @scala.inline
  def background_page: background_page = "background_page".asInstanceOf[background_page]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def beforeunload: beforeunload = "beforeunload".asInstanceOf[beforeunload]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def blockedbyclient: blockedbyclient = "blockedbyclient".asInstanceOf[blockedbyclient]
  @scala.inline
  def blockedbyresponse: blockedbyresponse = "blockedbyresponse".asInstanceOf[blockedbyresponse]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def camera: camera = "camera".asInstanceOf[camera]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def `clipboard-read`: `clipboard-read` = "clipboard-read".asInstanceOf[`clipboard-read`]
  @scala.inline
  def `clipboard-write`: `clipboard-write` = "clipboard-write".asInstanceOf[`clipboard-write`]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  @scala.inline
  def connectionaborted: connectionaborted = "connectionaborted".asInstanceOf[connectionaborted]
  @scala.inline
  def connectionclosed: connectionclosed = "connectionclosed".asInstanceOf[connectionclosed]
  @scala.inline
  def connectionfailed: connectionfailed = "connectionfailed".asInstanceOf[connectionfailed]
  @scala.inline
  def connectionrefused: connectionrefused = "connectionrefused".asInstanceOf[connectionrefused]
  @scala.inline
  def connectionreset: connectionreset = "connectionreset".asInstanceOf[connectionreset]
  @scala.inline
  def console: console = "console".asInstanceOf[console]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def dialog: dialog = "dialog".asInstanceOf[dialog]
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  @scala.inline
  def dirxml: dirxml = "dirxml".asInstanceOf[dirxml]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  @scala.inline
  def domcontentloaded: domcontentloaded = "domcontentloaded".asInstanceOf[domcontentloaded]
  @scala.inline
  def endGroup: endGroup = "endGroup".asInstanceOf[endGroup]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def eventsource: eventsource = "eventsource".asInstanceOf[eventsource]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fetch: fetch = "fetch".asInstanceOf[fetch]
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  @scala.inline
  def frameattached: frameattached = "frameattached".asInstanceOf[frameattached]
  @scala.inline
  def framedetached: framedetached = "framedetached".asInstanceOf[framedetached]
  @scala.inline
  def framenavigated: framenavigated = "framenavigated".asInstanceOf[framenavigated]
  @scala.inline
  def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  @scala.inline
  def gyroscope: gyroscope = "gyroscope".asInstanceOf[gyroscope]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def internetdisconnected: internetdisconnected = "internetdisconnected".asInstanceOf[internetdisconnected]
  @scala.inline
  def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def mac: mac = "mac".asInstanceOf[mac]
  @scala.inline
  def magnetometer: magnetometer = "magnetometer".asInstanceOf[magnetometer]
  @scala.inline
  def manifest: manifest = "manifest".asInstanceOf[manifest]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def metrics: metrics = "metrics".asInstanceOf[metrics]
  @scala.inline
  def microphone: microphone = "microphone".asInstanceOf[microphone]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def midi: midi = "midi".asInstanceOf[midi]
  @scala.inline
  def `midi-sysex`: `midi-sysex` = "midi-sysex".asInstanceOf[`midi-sysex`]
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  @scala.inline
  def namenotresolved: namenotresolved = "namenotresolved".asInstanceOf[namenotresolved]
  @scala.inline
  def networkidle0: networkidle0 = "networkidle0".asInstanceOf[networkidle0]
  @scala.inline
  def networkidle2: networkidle2 = "networkidle2".asInstanceOf[networkidle2]
  @scala.inline
  def notifications: notifications = "notifications".asInstanceOf[notifications]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  @scala.inline
  def pageerror: pageerror = "pageerror".asInstanceOf[pageerror]
  @scala.inline
  def `payment-handler`: `payment-handler` = "payment-handler".asInstanceOf[`payment-handler`]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  @scala.inline
  def print: print = "print".asInstanceOf[print]
  @scala.inline
  def profile: profile = "profile".asInstanceOf[profile]
  @scala.inline
  def profileEnd: profileEnd = "profileEnd".asInstanceOf[profileEnd]
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  @scala.inline
  def push: push = "push".asInstanceOf[push]
  @scala.inline
  def raf: raf = "raf".asInstanceOf[raf]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def requestfailed: requestfailed = "requestfailed".asInstanceOf[requestfailed]
  @scala.inline
  def requestfinished: requestfinished = "requestfinished".asInstanceOf[requestfinished]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def service_worker: service_worker = "service_worker".asInstanceOf[service_worker]
  @scala.inline
  def shared_worker: shared_worker = "shared_worker".asInstanceOf[shared_worker]
  @scala.inline
  def startGroup: startGroup = "startGroup".asInstanceOf[startGroup]
  @scala.inline
  def startGroupCollapsed: startGroupCollapsed = "startGroupCollapsed".asInstanceOf[startGroupCollapsed]
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  @scala.inline
  def table: table = "table".asInstanceOf[table]
  @scala.inline
  def targetchanged: targetchanged = "targetchanged".asInstanceOf[targetchanged]
  @scala.inline
  def targetcreated: targetcreated = "targetcreated".asInstanceOf[targetcreated]
  @scala.inline
  def targetdestroyed: targetdestroyed = "targetdestroyed".asInstanceOf[targetdestroyed]
  @scala.inline
  def texttrack: texttrack = "texttrack".asInstanceOf[texttrack]
  @scala.inline
  def timeEnd: timeEnd = "timeEnd".asInstanceOf[timeEnd]
  @scala.inline
  def timedout: timedout = "timedout".asInstanceOf[timedout]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  @scala.inline
  def win32: win32 = "win32".asInstanceOf[win32]
  @scala.inline
  def win64: win64 = "win64".asInstanceOf[win64]
  @scala.inline
  def workercreated: workercreated = "workercreated".asInstanceOf[workercreated]
  @scala.inline
  def workerdestroyed: workerdestroyed = "workerdestroyed".asInstanceOf[workerdestroyed]
  @scala.inline
  def xhr: xhr = "xhr".asInstanceOf[xhr]
}

