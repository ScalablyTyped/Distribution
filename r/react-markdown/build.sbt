organization := "org.scalablytyped"
name := "react-markdown"
version := "5.0.3-060d65"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20190907Z-5fe200",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
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
