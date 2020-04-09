package typings.react.mod

import typings.react.HTMLWebViewElement
import typings.std.HTMLAnchorElement
import typings.std.HTMLAreaElement
import typings.std.HTMLAudioElement
import typings.std.HTMLBRElement
import typings.std.HTMLBaseElement
import typings.std.HTMLBodyElement
import typings.std.HTMLButtonElement
import typings.std.HTMLCanvasElement
import typings.std.HTMLDListElement
import typings.std.HTMLDataElement
import typings.std.HTMLDataListElement
import typings.std.HTMLDialogElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLEmbedElement
import typings.std.HTMLFieldSetElement
import typings.std.HTMLFormElement
import typings.std.HTMLHRElement
import typings.std.HTMLHeadElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLHtmlElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLLabelElement
import typings.std.HTMLLegendElement
import typings.std.HTMLLinkElement
import typings.std.HTMLMapElement
import typings.std.HTMLMetaElement
import typings.std.HTMLModElement
import typings.std.HTMLOListElement
import typings.std.HTMLObjectElement
import typings.std.HTMLOptGroupElement
import typings.std.HTMLOptionElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLParamElement
import typings.std.HTMLPreElement
import typings.std.HTMLProgressElement
import typings.std.HTMLQuoteElement
import typings.std.HTMLScriptElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSlotElement
import typings.std.HTMLSourceElement
import typings.std.HTMLSpanElement
import typings.std.HTMLStyleElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTemplateElement
import typings.std.HTMLTextAreaElement
import typings.std.HTMLTitleElement
import typings.std.HTMLTrackElement
import typings.std.HTMLUListElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactDOM
  extends ReactHTML
     with ReactSVG

object ReactDOM {
  @scala.inline
  def apply(
    a: DetailedHTMLFactory[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement],
    abbr: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    address: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    animate: SVGFactory,
    area: DetailedHTMLFactory[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement],
    article: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    aside: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    audio: DetailedHTMLFactory[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement],
    b: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    base: DetailedHTMLFactory[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement],
    bdi: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    bdo: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    big: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    blockquote: DetailedHTMLFactory[BlockquoteHTMLAttributes[HTMLElement], HTMLElement],
    body: DetailedHTMLFactory[HTMLAttributes[HTMLBodyElement], HTMLBodyElement],
    br: DetailedHTMLFactory[HTMLAttributes[HTMLBRElement], HTMLBRElement],
    button: DetailedHTMLFactory[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement],
    canvas: DetailedHTMLFactory[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement],
    caption: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    circle: SVGFactory,
    cite: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    clipPath: SVGFactory,
    code: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    col: DetailedHTMLFactory[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
    colgroup: DetailedHTMLFactory[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
    data: DetailedHTMLFactory[DataHTMLAttributes[HTMLDataElement], HTMLDataElement],
    datalist: DetailedHTMLFactory[HTMLAttributes[HTMLDataListElement], HTMLDataListElement],
    dd: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    defs: SVGFactory,
    del: DetailedHTMLFactory[DelHTMLAttributes[HTMLElement], HTMLElement],
    desc: SVGFactory,
    details: DetailedHTMLFactory[DetailsHTMLAttributes[HTMLElement], HTMLElement],
    dfn: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    dialog: DetailedHTMLFactory[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement],
    div: DetailedHTMLFactory[HTMLAttributes[HTMLDivElement], HTMLDivElement],
    dl: DetailedHTMLFactory[HTMLAttributes[HTMLDListElement], HTMLDListElement],
    dt: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    ellipse: SVGFactory,
    em: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    embed: DetailedHTMLFactory[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement],
    feBlend: SVGFactory,
    feColorMatrix: SVGFactory,
    feComponentTransfer: SVGFactory,
    feComposite: SVGFactory,
    feConvolveMatrix: SVGFactory,
    feDiffuseLighting: SVGFactory,
    feDisplacementMap: SVGFactory,
    feDistantLight: SVGFactory,
    feDropShadow: SVGFactory,
    feFlood: SVGFactory,
    feFuncA: SVGFactory,
    feFuncB: SVGFactory,
    feFuncG: SVGFactory,
    feFuncR: SVGFactory,
    feGaussianBlur: SVGFactory,
    feImage: SVGFactory,
    feMerge: SVGFactory,
    feMergeNode: SVGFactory,
    feMorphology: SVGFactory,
    feOffset: SVGFactory,
    fePointLight: SVGFactory,
    feSpecularLighting: SVGFactory,
    feSpotLight: SVGFactory,
    feTile: SVGFactory,
    feTurbulence: SVGFactory,
    fieldset: DetailedHTMLFactory[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement],
    figcaption: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    figure: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    filter: SVGFactory,
    footer: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    foreignObject: SVGFactory,
    form: DetailedHTMLFactory[FormHTMLAttributes[HTMLFormElement], HTMLFormElement],
    g: SVGFactory,
    h1: DetailedHTMLFactory[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
    h2: DetailedHTMLFactory[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
    h3: DetailedHTMLFactory[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
    h4: DetailedHTMLFactory[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
    h5: DetailedHTMLFactory[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
    h6: DetailedHTMLFactory[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
    head: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLHeadElement],
    header: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    hgroup: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    hr: DetailedHTMLFactory[HTMLAttributes[HTMLHRElement], HTMLHRElement],
    html: DetailedHTMLFactory[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement],
    i: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    iframe: DetailedHTMLFactory[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement],
    image: SVGFactory,
    img: DetailedHTMLFactory[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement],
    input: DetailedHTMLFactory[InputHTMLAttributes[HTMLInputElement], HTMLInputElement],
    ins: DetailedHTMLFactory[InsHTMLAttributes[HTMLModElement], HTMLModElement],
    kbd: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    keygen: DetailedHTMLFactory[KeygenHTMLAttributes[HTMLElement], HTMLElement],
    label: DetailedHTMLFactory[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement],
    legend: DetailedHTMLFactory[HTMLAttributes[HTMLLegendElement], HTMLLegendElement],
    li: DetailedHTMLFactory[LiHTMLAttributes[HTMLLIElement], HTMLLIElement],
    line: SVGFactory,
    linearGradient: SVGFactory,
    link: DetailedHTMLFactory[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement],
    main: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    map: DetailedHTMLFactory[MapHTMLAttributes[HTMLMapElement], HTMLMapElement],
    mark: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    marker: SVGFactory,
    mask: SVGFactory,
    menu: DetailedHTMLFactory[MenuHTMLAttributes[HTMLElement], HTMLElement],
    menuitem: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    meta: DetailedHTMLFactory[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement],
    metadata: SVGFactory,
    meter: DetailedHTMLFactory[MeterHTMLAttributes[HTMLElement], HTMLElement],
    nav: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    noscript: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    `object`: DetailedHTMLFactory[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement],
    ol: DetailedHTMLFactory[OlHTMLAttributes[HTMLOListElement], HTMLOListElement],
    optgroup: DetailedHTMLFactory[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement],
    option: DetailedHTMLFactory[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement],
    output: DetailedHTMLFactory[OutputHTMLAttributes[HTMLElement], HTMLElement],
    p: DetailedHTMLFactory[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement],
    param: DetailedHTMLFactory[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement],
    path: SVGFactory,
    pattern: SVGFactory,
    picture: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    polygon: SVGFactory,
    polyline: SVGFactory,
    pre: DetailedHTMLFactory[HTMLAttributes[HTMLPreElement], HTMLPreElement],
    progress: DetailedHTMLFactory[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement],
    q: DetailedHTMLFactory[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement],
    radialGradient: SVGFactory,
    rect: SVGFactory,
    rp: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    rt: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    ruby: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    s: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    samp: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    script: DetailedHTMLFactory[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement],
    section: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    select: DetailedHTMLFactory[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement],
    slot: DetailedHTMLFactory[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement],
    small: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    source: DetailedHTMLFactory[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement],
    span: DetailedHTMLFactory[HTMLAttributes[HTMLSpanElement], HTMLSpanElement],
    stop: SVGFactory,
    strong: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    style: DetailedHTMLFactory[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement],
    sub: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    summary: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    sup: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    svg: SVGFactory,
    switch: SVGFactory,
    symbol: SVGFactory,
    table: DetailedHTMLFactory[TableHTMLAttributes[HTMLTableElement], HTMLTableElement],
    tbody: DetailedHTMLFactory[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
    td: DetailedHTMLFactory[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement],
    template: DetailedHTMLFactory[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement],
    text: SVGFactory,
    textPath: SVGFactory,
    textarea: DetailedHTMLFactory[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement],
    tfoot: DetailedHTMLFactory[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
    th: DetailedHTMLFactory[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement],
    thead: DetailedHTMLFactory[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
    time: DetailedHTMLFactory[TimeHTMLAttributes[HTMLElement], HTMLElement],
    title: DetailedHTMLFactory[HTMLAttributes[HTMLTitleElement], HTMLTitleElement],
    tr: DetailedHTMLFactory[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement],
    track: DetailedHTMLFactory[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement],
    tspan: SVGFactory,
    u: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    ul: DetailedHTMLFactory[HTMLAttributes[HTMLUListElement], HTMLUListElement],
    use: SVGFactory,
    `var`: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    video: DetailedHTMLFactory[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement],
    view: SVGFactory,
    wbr: DetailedHTMLFactory[HTMLAttributes[HTMLElement], HTMLElement],
    webview: DetailedHTMLFactory[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]
  ): ReactDOM = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactDOM]
  }
}

