organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "0.2-dt-20190306Z-f150e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-2bacf1",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d1a095",
  "org.scalablytyped" %%% "del" % "4.0.0-68ec0f",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-ae3b1d",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-756eb7",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-ab6d7c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a21654",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-57b73f",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-24e045",
  "org.scalablytyped" %%% "globby" % "9.1.0-a96868",
  "org.scalablytyped" %%% "ignore" % "4.0.6-4c3dd0",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-2e5f61",
  "org.scalablytyped" %%% "is-path-cwd" % "1.0-dt-20180214Z-5e711a",
  "org.scalablytyped" %%% "is-path-in-cwd" % "1.0-dt-20180214Z-253e21",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-8f2994",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-493cc6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-3c7beb",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-6964e5",
  "org.scalablytyped" %%% "p-map" % "2.0.0-ab3a24",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-49bec0",
  "org.scalablytyped" %%% "rollup" % "1.6.0-915454",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-e92736",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        