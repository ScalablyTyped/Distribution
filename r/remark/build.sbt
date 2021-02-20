organization := "org.scalablytyped"
name := "remark"
version := "13.0.0-fe4671"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20190907Z-5fe200",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "0.8.1-93fb91",
  "org.scalablytyped" %%% "micromark" % "2.10.1-81c575",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "remark-parse" % "9.0.0-e94c8e",
  "org.scalablytyped" %%% "remark-stringify" % "8.1.1-78fcdf",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "unified" % "8.4.2-d0f227",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-1e36bc",
  "org.scalablytyped" %%% "vfile" % "4.2.0-7023f1",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-d6ba74")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
